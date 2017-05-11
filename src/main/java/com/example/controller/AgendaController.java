package com.example.controller;

import com.example.domain.Contacto;
import com.example.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * Created by mariano.palliser on 08/05/2017.
 */
@Controller
public class AgendaController {

	private AgendaService agendaService;

	@Autowired
	public AgendaController(AgendaService agendaService) {

		super();
		this.agendaService = agendaService;

	}

	@RequestMapping("/")
	public String home() {

		return "index";

	}

	@RequestMapping("/agregar")
	public String agregar(Model model) {

		model.addAttribute("contacto", new Contacto());
		return "funciones/agregar";

	}

	@RequestMapping( value = "/agregar/save", method = RequestMethod.POST )
	public String save(@Valid Contacto contacto, BindingResult bindingResult, RedirectAttributes redirectAttrs) {

		if( bindingResult.hasErrors() ) {
			return "funciones/agregar";
		} else {
			Contacto contactoGuardado = agendaService.save(contacto);
			redirectAttrs.addFlashAttribute("message", "Contacto guardado correctamente");
			return "redirect:/agregar"; //+ contactoGuardado.getTelefono();
		}

	}

	@RequestMapping("/mostrar")
	public String mostrar(Model model) {

		model.addAttribute("contactos", agendaService.list());
		return "funciones/mostrar";

	}

	@RequestMapping("/eliminar/{telefono}")
	public String eliminar(@PathVariable int telefono, RedirectAttributes redirectAttrs){

		agendaService.eliminar(telefono);
		redirectAttrs.addFlashAttribute("message", "Contacto borrado correctamente");
		return "redirect:/mostrar";

	}

	@RequestMapping("/editar/{telefono}")
	public String editar(@PathVariable Integer telefono, Model model) {

		model.addAttribute("contacto", agendaService.get(telefono));
		return "funciones/agregar";

	}

}

package com.example.controller;

import com.example.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mariano.palliser on 08/05/2017.
 */
@Controller
public class AgendaController {

	private AgendaService agendaService;

	@Autowired
	public void setAgendaService(AgendaService agendaService) {
		this.agendaService = agendaService;
	}

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/agregar")
	public String agregar() {
		return "funciones/agregar";
	}
}

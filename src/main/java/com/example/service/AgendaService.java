package com.example.service;

import com.example.domain.Contacto;
import com.example.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mariano.palliser on 08/05/2017.
 */
@Service
public class AgendaService {

	private ContactoRepository agenda;

	@Autowired
	public AgendaService(ContactoRepository agenda) {

		this.agenda = agenda;

	}

	public Contacto save(Contacto contacto){

		return agenda.save(contacto);

	}

	public Iterable<Contacto> list() {

		return agenda.findAll();

	}

	public void eliminar(int telefono) {

		agenda.delete(telefono);

	}

	public Contacto get(Integer telefono) {

		return agenda.findOne(telefono);

	}

}

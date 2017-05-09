package com.example.service;

import com.example.domain.Contacto;
import com.example.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mariano.palliser on 08/05/2017.
 */
@Service
public class AgendaService {

	private ContactoRepository agenda;

	@Autowired
	public void setAgenda(ContactoRepository agenda) {
		this.agenda = agenda;
	}

}

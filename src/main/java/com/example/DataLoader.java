package com.example;

import com.example.domain.Contacto;
import com.example.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by mariano.palliser on 10/05/2017.
 */
@Component
public class DataLoader {

	private ContactoRepository agenda;

	@Autowired
	public DataLoader(ContactoRepository agenda) {
		this.agenda = agenda;
	}

	@PostConstruct
	private void loadData() {
		agenda.deleteAll();

		agenda.save(new Contacto("Ana", "Dominguez", 666666666));
		agenda.save(new Contacto("Mario", "Gomez", 111111111));
		agenda.save(new Contacto("Juan", "Lopez", 222222222));
		agenda.save(new Contacto("Lluis", "Muñoz", 333333333));

	}
}

package com.example.repository;

import com.example.domain.Contacto;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mariano.palliser on 08/05/2017.
 */
public interface ContactoRepository extends CrudRepository<Contacto, String> {
}

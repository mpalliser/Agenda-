package com.example.repository;

import com.example.domain.Contacto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mariano.palliser on 08/05/2017.
 */
@Repository
public interface ContactoRepository extends CrudRepository<Contacto, Integer> {

}

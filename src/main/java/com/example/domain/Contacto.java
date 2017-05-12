package com.example.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by mariano.palliser on 08/05/2017.
 */
@Entity
public class Contacto {

	@Id @GeneratedValue
	private Integer id;

	@NotEmpty
	private String nombre;

	@NotEmpty
	private String apellido;

	@NotNull
	private Integer telefono;

	public Contacto() {
	}

	public Contacto(String nombre, String apellido, Integer telefono) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
}

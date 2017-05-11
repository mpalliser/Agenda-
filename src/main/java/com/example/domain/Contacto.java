package com.example.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by mariano.palliser on 08/05/2017.
 */
@Entity
public class Contacto {

	@NotEmpty
	private String nombre;

	@NotEmpty
	private String apellido;

	@Id
	@NotNull
	private Integer telefono;

	public Contacto() {
		this.nombre = nombre;
	}

	public Contacto(String nombre, String apellido, Integer telefono) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;

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

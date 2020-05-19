package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public", name="estudiante")
public class Estudiante {
	
	@Id
	@Column(name="c_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	@Column(name="nombre")
	@NotEmpty(message="No puede estar vacio")
	private String nombre;
	
	@Column(name="apellido")
	@NotEmpty(message="No puede estar vacio")
	private String apellido;
	
	@Column(name="carne")
	@NotEmpty(message="No puede estar vacio")
	@Size(min=8, max=8, message="El carne debe tener exactamente 8 digitos")
	private String carne;
	
	@Column(name="carrera")
	@NotEmpty(message="No puede estar vacio")
	private String carrera;
	
	public Estudiante() {
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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

	public String getCarne() {
		return carne;
	}

	public void setCarne(String carne) {
		this.carne = carne;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
}

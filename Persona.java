package org.trabajopractico4.persona;

import javax.persistence.*;

import org.openxava.annotations.*;

import com.oracle.webservices.internal.api.*;

@Entity
public class Persona
{
	@Id @Column(length=8)@Required 	
	public int Dni;
	public int getDni() {
		return Dni;
	}

	public void setDni(int dni) {
		Dni = dni;
	}

	@Column(length=20)@Required
	public String Nombre;
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	@Column(length=20)@Required
	public String Apellido;
	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	@Column(length=50)@Required
	public String Direccion;	
	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	@Column(length=9)@Required
	public int Telefono;
	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}

	@Column(length=20) @Required
	public String Email;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

	
	
	public Gimnasio gimnasio;

		
	public Programas programas;

		
	public Alumno alumno;


	
	public Preceptor preceptor;

	
	
	public Profesor profesor;

	/
	
	public Aula aula;

	
	
	public Gestion gestion;



}


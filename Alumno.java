package org.trabajopractico4.alumno;

import javax.persistence.*;

import org.trabajopractico4.persona.*;

@Entity
public class Alumno extends Persona {

	public Persona persona;

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	
//Hola mundito
}



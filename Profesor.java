package org.trabajopractico4.profesor;

import javax.persistence.*;

import org.trabajopractico4.persona.*;

@Entity
public class Profesor {


	private Persona persona;

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	
	}





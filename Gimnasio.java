package org.trabajopractico4.gimnasio;

import javax.persistence.*;

import org.trabajopractico4.persona.*;

@Entity
public class Gimnasio {
	private int idgim;

	
	
	public int getIdgim() {
		return idgim;
	}



	public void setIdgim(int idgim) {
		this.idgim = idgim;
	}



	private Persona persona;



	public Persona getPersona() {
		return persona;
	}



	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	
	

}




package org.trabajopractico4.aula;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.trabajopractico4.gestion.*;
import org.trabajopractico4.persona.*;

@Entity
public class Aula {

	@Id @Column(length=2) @Required
	private int IdAula;

	
	public int getIdAula() {
		return IdAula;
	}


	public void setIdAula(int idAula) {
		IdAula = idAula;
	}

 
	@Column(length=15)
	private String Nombre;

	
	

		
	public Persona persona;

	
	
	public Gestion gestion;

	
}



package org.trabajopractico4.taller;

import javax.persistence.*;

import org.trabajopractico4.aula.*;

@Entity
public class Taller extends Aula {

	public Aula aula;

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}


}



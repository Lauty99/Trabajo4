package org.trabajopractico4.teoria;

import javax.persistence.*;

import org.trabajopractico4.aula.*;

@Entity
public class Teoria extends Aula {

	public Aula aula;

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	


}


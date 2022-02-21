package net.com.scm.sg2022.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_resultado")
public class Resultado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long numero;
	private String dezenas;

	
	public Resultado() {}

	public Resultado(Long id, Long numero, String dezenas) {
		this.id = id;
		this.numero = numero;
		this.dezenas = dezenas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getDezenas() {
		return dezenas;
	}

	public void setDezenas(String dezenas) {
		this.dezenas = dezenas;
	}

}

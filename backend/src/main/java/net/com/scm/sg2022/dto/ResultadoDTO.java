package net.com.scm.sg2022.dto;

import net.com.scm.sg2022.entities.Resultado;

public class ResultadoDTO {
	private Long id;
	private Long numero;
	private String dezenas;
	
	
	public ResultadoDTO() {}
	
	public ResultadoDTO(Long id, Long numero, String dezenas) {
		this.id = id;
		this.numero = numero;
		this.dezenas = dezenas;
	}
	
	public ResultadoDTO(Resultado resultado) {
		this.id = resultado.getId();
		this.numero = resultado.getNumero();
		this.dezenas = resultado.getDezenas();
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

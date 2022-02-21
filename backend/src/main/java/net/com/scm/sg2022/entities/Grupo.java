package net.com.scm.sg2022.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_grupo")
public class Grupo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long nun_grupo;
	private String dezenas;
	private Integer quantidade;
	
	public Grupo() {}

	public Grupo(Long id, Long nun_grupo, String dezenas, Integer quantidade) {
		super();
		this.id = id;
		this.nun_grupo = nun_grupo;
		this.dezenas = dezenas;
		this.quantidade = quantidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNun_grupo() {
		return nun_grupo;
	}

	public void setNun_grupo(Long nun_grupo) {
		this.nun_grupo = nun_grupo;
	}

	public String getDezenas() {
		return dezenas;
	}

	public void setDezenas(String dezenas) {
		this.dezenas = dezenas;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
}

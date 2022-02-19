package net.com.scm.sg2022.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_mapgrupo")
public class MapGrupo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dezenas;
	
	public MapGrupo() {}
	
	
	public MapGrupo(Long id, String dezenas) {
		this.id = id;
		this.dezenas = dezenas;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDezenas() {
		return dezenas;
	}


	public void setDezenas(String dezenas) {
		this.dezenas = dezenas;
	}
	
	
}

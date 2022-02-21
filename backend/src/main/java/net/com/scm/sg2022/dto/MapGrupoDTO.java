package net.com.scm.sg2022.dto;

import net.com.scm.sg2022.entities.MapGrupo;

public class MapGrupoDTO {

	private Long id;
	private String dezenas;
	
	public MapGrupoDTO() {}
	
	public MapGrupoDTO(Long id, String dezenas) {
		this.id = id;
		this.dezenas = dezenas;
	}
	
	public MapGrupoDTO(MapGrupo mapGrupo) {
		this.id = mapGrupo.getId();
		this.dezenas = mapGrupo.getDezenas();
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

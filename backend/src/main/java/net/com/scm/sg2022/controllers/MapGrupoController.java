package net.com.scm.sg2022.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.com.scm.sg2022.dto.MapGrupoDTO;
import net.com.scm.sg2022.services.MapGrupoService;

@RestController
@RequestMapping(value="/map")
public class MapGrupoController {
	
	@Autowired
	private MapGrupoService mapGrupoService;
	
	@GetMapping(value="grupos")
	public Page<MapGrupoDTO> findAll(Pageable pageable) {
		return mapGrupoService.findAll(pageable);
	}

	@GetMapping(value = "/grupos/{id}")
	public MapGrupoDTO findById(@PathVariable Long id) {
		return mapGrupoService.findById(id);
	}
}

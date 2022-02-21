package net.com.scm.sg2022.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.com.scm.sg2022.dto.MapGrupoDTO;
import net.com.scm.sg2022.entities.MapGrupo;
import net.com.scm.sg2022.repositories.MapGrupoRepository;

@Service
public class MapGrupoService {
	
	@Autowired
	private MapGrupoRepository mapGrupoRepository;

	@Transactional(readOnly = true)
	public Page<MapGrupoDTO> findAll(Pageable pageable) {
		Page<MapGrupo> result = mapGrupoRepository.findAll(pageable);
		
		Page<MapGrupoDTO> page = result.map(x -> new MapGrupoDTO(x));
		
		return page;
	}
	
	@Transactional(readOnly = true)
	public MapGrupoDTO findById(Long id) {
		MapGrupo result = mapGrupoRepository.findById(id).get();
		
		MapGrupoDTO dto = new MapGrupoDTO(result);
		
		return dto;
	}
}

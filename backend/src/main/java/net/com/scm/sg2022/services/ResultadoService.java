package net.com.scm.sg2022.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.com.scm.sg2022.dto.ResultadoDTO;
import net.com.scm.sg2022.entities.Resultado;
import net.com.scm.sg2022.repositories.ResultadoRepository;

@Service
public class ResultadoService {
	
	@Autowired
	private ResultadoRepository resultadoRepository;

	@Transactional(readOnly = true)
	public Page<ResultadoDTO> findAll(Pageable pageable) {
		Page<Resultado> result = resultadoRepository.findAll(pageable);
		
		Page<ResultadoDTO> page = result.map(x -> new ResultadoDTO(x));
		
		return page;
	}
	
	@Transactional(readOnly = true)
	public ResultadoDTO findById(Long id) {
		Resultado result = resultadoRepository.findById(id).get();
		
		ResultadoDTO dto = new ResultadoDTO(result);
		
		return dto;
	}
	
	@Transactional(readOnly = true)
	public ResultadoDTO findByNumero(Long numero) {
		Resultado result = resultadoRepository.findById(numero).get();
		
		ResultadoDTO dto = new ResultadoDTO(result);
		
		return dto;
	}

}

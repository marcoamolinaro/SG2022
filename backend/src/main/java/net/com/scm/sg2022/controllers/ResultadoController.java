package net.com.scm.sg2022.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.com.scm.sg2022.dto.ResultadoDTO;
import net.com.scm.sg2022.services.ResultadoService;

@RestController
@RequestMapping(value="/resultados")
public class ResultadoController {
	
	@Autowired
	private ResultadoService resultadoService;
	
	@GetMapping
	public Page<ResultadoDTO> findAll(Pageable pageable) {
		return resultadoService.findAll(pageable);
	}

	@GetMapping(value = "/{id}")
	public ResultadoDTO findById(@PathVariable Long id) {
		return resultadoService.findById(id);
	}
	
	@GetMapping(value = "/numero/{numero}")
	public ResultadoDTO findByNumero(@PathVariable Long numero) {
		return resultadoService.findByNumero(numero);
	}

}

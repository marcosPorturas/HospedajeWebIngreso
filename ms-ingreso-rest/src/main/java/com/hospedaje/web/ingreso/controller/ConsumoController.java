package com.hospedaje.web.ingreso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospedaje.web.ingreso.dto.request.ConsumoRequest;
import com.hospedaje.web.ingreso.dto.response.ConsumoResponse;
import com.hospedaje.web.ingreso.service.ConsumoService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/consumo")
public class ConsumoController {
	
	@Autowired
	ConsumoService consumoService;
	
	@PostMapping("/agregar")
	public Mono<ConsumoResponse> agregarConsumo(@RequestBody ConsumoRequest consumoRequest){
		return consumoService.agregarConsumo(consumoRequest.getIdIngreso(), 
				consumoRequest.getListProducto());
	}

}

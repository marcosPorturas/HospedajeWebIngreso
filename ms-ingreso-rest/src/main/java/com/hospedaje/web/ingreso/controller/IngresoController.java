package com.hospedaje.web.ingreso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospedaje.web.ingreso.dto.request.ConsumoRequest;
import com.hospedaje.web.ingreso.dto.request.IngresoRequest;
import com.hospedaje.web.ingreso.dto.response.ConsumoResponse;
import com.hospedaje.web.ingreso.dto.response.IngresoResponse;
import com.hospedaje.web.ingreso.dto.response.SocioResponse;
import com.hospedaje.web.ingreso.service.IngresoService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/ingreso")
public class IngresoController {

	@Autowired
	IngresoService ingresoService;
	
	
	@GetMapping("/{idIngreso}")
	public Mono<IngresoResponse> agregarIngreso(@PathVariable("idIngreso")Integer idIngreso) {
		return ingresoService.consultarIngreso(idIngreso);
	}
	
	@PostMapping("/agregar")
	public Mono<IngresoResponse> agregarIngreso(@RequestBody IngresoRequest ingresoRequest) {
		return ingresoService.registrarIngreso(ingresoRequest);
	}
	
	@PostMapping("/consumo")
	public Mono<ConsumoResponse> agregarConsumo(@RequestBody ConsumoRequest consumoRequest) {
		return ingresoService.registrarConsumo(consumoRequest);
	}
	
}

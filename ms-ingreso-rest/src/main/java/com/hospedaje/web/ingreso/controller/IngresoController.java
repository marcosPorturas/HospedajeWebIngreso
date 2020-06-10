package com.hospedaje.web.ingreso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospedaje.web.ingreso.dto.request.IngresoRequest;
import com.hospedaje.web.ingreso.dto.response.SocioResponse;
import com.hospedaje.web.ingreso.service.IngresoService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/ingreso")
public class IngresoController {

	@Autowired
	IngresoService ingresoService;
	
	
	@PostMapping("/agregar")
	public Mono<SocioResponse> agregarIngreso(@RequestBody IngresoRequest ingresoRequest) {
		return ingresoService.registrarIngreso(ingresoRequest);
	}
	
}

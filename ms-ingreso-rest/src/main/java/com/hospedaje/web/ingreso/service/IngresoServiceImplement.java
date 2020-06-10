package com.hospedaje.web.ingreso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.hospedaje.web.ingreso.client.SocioProxy;
import com.hospedaje.web.ingreso.dto.request.IngresoRequest;
import com.hospedaje.web.ingreso.dto.response.SocioResponse;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class IngresoServiceImplement implements IngresoService{
	
	@Autowired
	SocioProxy socioProxy;
	
	@Autowired
	Gson gson;
		
	@Override
	public Mono<SocioResponse> registrarIngreso(IngresoRequest ingresoRequest) {
	return	Mono.fromCallable(()->socioProxy.obtenerSocio(ingresoRequest.getIdSocio()))
				.doOnSubscribe(subcription->log.info("Result Event"));
	}

}

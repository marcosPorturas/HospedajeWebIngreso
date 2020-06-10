package com.hospedaje.web.ingreso.service;

import com.hospedaje.web.ingreso.dto.request.IngresoRequest;
import com.hospedaje.web.ingreso.dto.response.GetSocioResponse;

import reactor.core.publisher.Mono;

public interface IngresoService {

	Mono<GetSocioResponse> registrarIngreso(IngresoRequest ingresoRequest);
	
}

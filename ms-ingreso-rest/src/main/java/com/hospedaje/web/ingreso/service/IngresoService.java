package com.hospedaje.web.ingreso.service;

import com.hospedaje.web.ingreso.dto.request.ConsumoRequest;
import com.hospedaje.web.ingreso.dto.request.IngresoRequest;
import com.hospedaje.web.ingreso.dto.response.ConsumoResponse;
import com.hospedaje.web.ingreso.dto.response.IngresoResponse;


import reactor.core.publisher.Mono;

public interface IngresoService {

	Mono<IngresoResponse> registrarIngreso(IngresoRequest ingresoRequest);
	
	Mono<ConsumoResponse> registrarConsumo(ConsumoRequest consumoRequest);
	
}

package com.hospedaje.web.ingreso.service;

import com.hospedaje.web.ingreso.dto.request.ConsumoRequest;
import com.hospedaje.web.ingreso.entity.Consumo;

import reactor.core.publisher.Mono;

public interface ConsumoService {
	
	Mono<Consumo> agregarConsumo(ConsumoRequest consumoRequest);

}

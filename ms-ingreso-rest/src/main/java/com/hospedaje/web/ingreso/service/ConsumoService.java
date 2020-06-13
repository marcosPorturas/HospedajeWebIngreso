package com.hospedaje.web.ingreso.service;

import java.util.List;

import com.hospedaje.web.ingreso.dto.request.ProductoRequest;
import com.hospedaje.web.ingreso.dto.response.ConsumoResponse;

import reactor.core.publisher.Mono;

public interface ConsumoService {
	
	Mono<ConsumoResponse> agregarConsumo(Integer idIngreso,List<ProductoRequest> listProducto);

}

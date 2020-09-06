package com.hospedaje.web.ingreso.client;

import java.util.List;

import com.hospedaje.web.ingreso.dto.request.ProductoConsumo;
import com.hospedaje.web.ingreso.dto.response.ProductoResponse;
import com.hospedaje.web.ingreso.dto.response.ValidarStockResponse;

import reactor.core.publisher.Mono;

public interface ProductoProxy {

	List<ProductoResponse> listarProductoXIds(int[] idProductos);
	
	Mono<ValidarStockResponse> validarStock(List<ProductoConsumo> lstProductoConsumo);
}

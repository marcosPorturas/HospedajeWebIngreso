package com.hospedaje.web.ingreso.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospedaje.web.ingreso.client.feign.ProductoFeign;
import com.hospedaje.web.ingreso.dto.request.ProductoConsumo;
import com.hospedaje.web.ingreso.dto.response.ProductoResponse;
import com.hospedaje.web.ingreso.dto.response.ValidarStockResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class ProductoProxyImplement implements ProductoProxy{
	
	@Autowired
	ProductoFeign productoFeign;

	@Override
	public List<ProductoResponse> listarProductoXIds(int[] idProductos) {
		return productoFeign.listarProductoXIds(idProductos);
	}

	@Override
	public Mono<ValidarStockResponse> validarStock(List<ProductoConsumo> lstProductoConsumo) {
		// TODO Auto-generated method stub
		return Mono.just(productoFeign.validarStock(lstProductoConsumo));
	}

	@Override
	public Flux<ProductoResponse> actualizarStock(List<ProductoConsumo> lstProductoConsumo) {
		// TODO Auto-generated method stub
		return Flux.fromIterable(productoFeign.actualizarStock(lstProductoConsumo));
	}

}

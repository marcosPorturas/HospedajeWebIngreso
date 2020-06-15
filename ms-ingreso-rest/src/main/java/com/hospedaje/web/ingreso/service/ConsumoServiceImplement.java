package com.hospedaje.web.ingreso.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospedaje.web.ingreso.client.feign.ProductoFeign;
import com.hospedaje.web.ingreso.dto.request.ProductoRequest;
import com.hospedaje.web.ingreso.dto.response.ConsumoResponse;
import com.hospedaje.web.ingreso.dto.response.ProductoConsumo;
import com.hospedaje.web.ingreso.entity.Consumo;
import com.hospedaje.web.ingreso.repository.ConsumoRepository;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class ConsumoServiceImplement implements ConsumoService{

	@Autowired
	ConsumoRepository consumoRepository;
	
	@Autowired
	ProductoFeign productoProxy;
	
	@Override
	public Mono<ConsumoResponse> agregarConsumo(Integer idIngreso, List<ProductoRequest> listProducto) {
		return  Flux.fromIterable(productoProxy.listarProductoXIds(getAllIdProducto(listProducto)))
					.map(response->{
						listProducto.forEach(p->{
						p.setDetalle(response.getDetalle());
						p.setFechaPedio(new Date());
						p.setPrecioUnitario(response.getPrecioUnitario());
						});
						return listProducto;
						})
					.map(request->Consumo.builder()
							.idIngreso(idIngreso)
							.listProduct(request)
							.build())
					.flatMap(consumoRepository::save)
					.map(this::convertToConsumoResponse)
					.singleOrEmpty();
					
	}
	
	
	
	private int[] getAllIdProducto(List<ProductoRequest> listProducto){
		return listProducto.stream().mapToInt(producto->producto.getIdProducto()).toArray();
	}
	
	private ConsumoResponse convertToConsumoResponse(Consumo consumo) {
		
		List<ProductoConsumo> listProductoConsumo = consumo.getListProduct()
				.stream().map(x->convertToProductoConsumo(x))
				.collect(Collectors.toList());
		
		return ConsumoResponse.builder()
				.idIngreso(consumo.getIdIngreso())
				.listProducto(listProductoConsumo).build();
	}
	
	private ProductoConsumo convertToProductoConsumo(ProductoRequest productoRequest) {
		return ProductoConsumo.builder()
				.idProducto(productoRequest.getIdProducto())
				.detalle(productoRequest.getDetalle())
				.cantidad(productoRequest.getCantidad())
				.precioUnitario(productoRequest.getPrecioUnitario())
				.subTotal(productoRequest.getCantidad()*productoRequest.getPrecioUnitario())
				.build();
	}
	
	
}

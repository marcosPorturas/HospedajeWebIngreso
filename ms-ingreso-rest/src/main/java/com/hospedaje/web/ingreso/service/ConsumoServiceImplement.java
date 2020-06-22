package com.hospedaje.web.ingreso.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospedaje.web.ingreso.client.feign.ProductoFeign;
import com.hospedaje.web.ingreso.dto.request.ConsumoRequest;
import com.hospedaje.web.ingreso.dto.request.ProductoRequest;
import com.hospedaje.web.ingreso.dto.response.ConsumoResponse;
import com.hospedaje.web.ingreso.dto.response.ProductoConsumo;
import com.hospedaje.web.ingreso.dto.response.ProductoResponse;
import com.hospedaje.web.ingreso.entity.Consumo;
import com.hospedaje.web.ingreso.repository.ConsumoRepository;
import com.hospedaje.web.ingreso.util.Utilitario;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
@Slf4j
public class ConsumoServiceImplement implements ConsumoService{

	@Autowired
	ConsumoRepository consumoRepository;
	
	@Autowired
	ProductoFeign productoProxy;
	
	@Override
	public Mono<Consumo> agregarConsumo(ConsumoRequest consumoRequest) {
		return Mono.just(productoProxy.)
				
				
						
	}
	
	private Consumo convertToEntity (ConsumoRequest consumoRequest) {
		
		List<ProductoConsumo> listProductoConsumo = new ArrayList<>();
		consumoRequest.getListProducto().forEach(x->listProductoConsumo.add(convertToProductoConsumo(x)));
		
		return Consumo.builder()
				.idIngreso(consumoRequest.getIdIngreso())
				.listProductoConsumo(listProductoConsumo).build();
	}
	
	
	private ProductoConsumo convertToProductoConsumo(ProductoResponse productoResponse,Integer cantidad) {
		return ProductoConsumo.builder()
				.idProducto(productoRequest.getIdProducto())
				.cantidad(productoRequest.getCantidad())
				.detalle(productoRequest.getDetalle())
				.precioUnitario(productoRequest.getPrecioUnitario())
				.subTotal(productoRequest.getPrecioUnitario()*productoRequest.getCantidad())
				.fechaPedido(Utilitario.convertirFechaddMMYYYY(productoRequest.getFechaPedio()))
				.build();
	}
	
	
}

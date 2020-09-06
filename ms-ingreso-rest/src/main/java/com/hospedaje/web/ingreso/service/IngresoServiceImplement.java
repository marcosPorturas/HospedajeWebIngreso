package com.hospedaje.web.ingreso.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hospedaje.web.ingreso.client.ProductoProxy;
import com.hospedaje.web.ingreso.client.SocioProxy;
import com.hospedaje.web.ingreso.dto.request.ConsumoRequest;
import com.hospedaje.web.ingreso.dto.request.IngresoRequest;
import com.hospedaje.web.ingreso.dto.response.ConsumoResponse;
import com.hospedaje.web.ingreso.dto.response.IngresoResponse;
import com.hospedaje.web.ingreso.dto.response.ProductoStock;
import com.hospedaje.web.ingreso.dto.response.SocioResponse;
import com.hospedaje.web.ingreso.dto.response.ValidarStockResponse;
import com.hospedaje.web.ingreso.entity.Consumo;
import com.hospedaje.web.ingreso.entity.Ingreso;
import com.hospedaje.web.ingreso.entity.IngresoStatus;
import com.hospedaje.web.ingreso.repository.ConsumoRepository;
import com.hospedaje.web.ingreso.repository.IngresoRepository;
import com.hospedaje.web.ingreso.repository.IngresoStatusRepository;
import com.hospedaje.web.ingreso.util.Utilitario;

import reactor.core.publisher.Mono;


@Service
public class IngresoServiceImplement implements IngresoService{
	
	@Autowired
	SocioProxy socioProxy;
	
	@Autowired
	ProductoProxy productoProxy;
 	
	@Autowired
	IngresoRepository ingresoRepository;
	
	@Autowired
	ConsumoRepository consumoRepository;
	
	@Autowired
	IngresoStatusRepository ingresoStatusRepository;
	
		
	@Override
	public Mono<IngresoResponse> registrarIngreso(IngresoRequest ingresoRequest) {
		
		Mono<SocioResponse> socio = Mono.just(socioProxy.obtenerSocio(ingresoRequest.getIdSocio()));
		
		return	Mono.zip(socio,ingresoStatusRepository.findById(0))
					.map(tupla->convertToIngresoEntity(tupla.getT1(),ingresoRequest,tupla.getT2()))
					.flatMap(ingresoRepository::save)
					.map(this::convertToIngresoResponse);
	
	}

	private Ingreso convertToIngresoEntity(SocioResponse socio,IngresoRequest ingreso,IngresoStatus status) {
	
		return Ingreso.builder()
				.idIngreso(ingreso.getIdIngreso())
				.socioResponse(socio)
				.creationDate(new Date())
				.numeroInvitados(ingreso.getNumeroInvitados())
				.costoIngreso(ingreso.getCostoIngreso())
				.ingresoStatus(status).build();
		
	}
	
	
	private IngresoResponse convertToIngresoResponse(Ingreso ingreso) {
		return IngresoResponse.builder()
				.idIngreso(ingreso.getIdIngreso())
				.datosSocio(ingreso.getSocioResponse().getNombres()
						.concat(" ").concat(ingreso.getSocioResponse().getApellidos()))
				.fechaIngreso(Utilitario.convertirFechaddMMYYYY(ingreso.getCreationDate()))
				.horaIngreso(Utilitario.convertirHoraHHmmss(ingreso.getCreationDate()))
				.numeroInvitados(ingreso.getNumeroInvitados())
				.status(ingreso.getIngresoStatus().getDescripcion())
				.build();
	}
	
	private Consumo convertToEntityConsumo(List<ProductoStock> listProductos,ConsumoRequest consumoRequest){
		return Consumo.builder()
				.idIngreso(consumoRequest.getIdIngreso())
				.listProductoConsumo(listProductos)
				.build();
	}
	
	private ConsumoResponse convertToConsumoResponse(Consumo consumo) {
		return ConsumoResponse.builder()
				.idIngreso(consumo.getIdIngreso())
				.listProducto(consumo.getListProductoConsumo()).build();
	}
	

	@Override
	public Mono<ConsumoResponse> registrarConsumo(ConsumoRequest consumoRequest) {
		// TODO Auto-generated method stub
		Mono<ValidarStockResponse> singleValidarStock = productoProxy.validarStock(consumoRequest.getListProducto());
		
		return singleValidarStock
				.filter(validar->validar.getAgotado().size()==0)
				.map(validar->convertToEntityConsumo(validar.getAlmacen(), consumoRequest))
				.flatMap(consumoRepository::save)
				.map(this::convertToConsumoResponse);
	}
	
}

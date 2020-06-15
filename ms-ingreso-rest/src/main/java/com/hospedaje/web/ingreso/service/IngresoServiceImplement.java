package com.hospedaje.web.ingreso.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.hospedaje.web.ingreso.client.feign.SocioFeign;
import com.hospedaje.web.ingreso.dto.request.IngresoRequest;
import com.hospedaje.web.ingreso.dto.response.IngresoResponse;
import com.hospedaje.web.ingreso.dto.response.SocioResponse;
import com.hospedaje.web.ingreso.entity.Ingreso;
import com.hospedaje.web.ingreso.repository.IngresoRepository;
import com.hospedaje.web.ingreso.util.Utilitario;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class IngresoServiceImplement implements IngresoService{
	
	@Autowired
	SocioFeign socioProxy;
	
	@Autowired
	IngresoRepository ingresoRepository;
	
	@Autowired
	Gson gson;
		
	@Override
	public Mono<IngresoResponse> registrarIngreso(IngresoRequest ingresoRequest) {
		return	Mono.just(socioProxy.obtenerSocio(ingresoRequest.getIdSocio()))
					.map(socio->convertToIngresoEntity(socio,ingresoRequest))
					.flatMap(ingresoRepository::save)
					.map(this::convertToIngresoResponse);
	
	}

	private Ingreso convertToIngresoEntity(SocioResponse socio,IngresoRequest ingreso) {
	
		return Ingreso.builder()
				.idIngreso(ingreso.getIdIngreso())
				.socioResponse(socio)
				.creationDate(new Date())
				.numeroInvitados(ingreso.getNumeroInvitados())
				.costoIngreso(ingreso.getCostoIngreso())
				.enabled(false).build();
		
	}
	
	
	private IngresoResponse convertToIngresoResponse(Ingreso ingreso) {
		return IngresoResponse.builder()
				.idIngreso(ingreso.getIdIngreso())
				.datosSocio(ingreso.getSocioResponse().getNombres()
						.concat(" ").concat(ingreso.getSocioResponse().getApellidos()))
				.fechaIngreso(Utilitario.convertirFechaddMMYYYY(ingreso.getCreationDate()))
				.horaIngreso(Utilitario.convertirHoraHHmmss(ingreso.getCreationDate()))
				.numeroInvitados(ingreso.getNumeroInvitados()).build();
	}
	
}

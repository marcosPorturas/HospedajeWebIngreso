package com.hospedaje.web.ingreso.client;

import com.hospedaje.web.ingreso.dto.response.SocioResponse;

import reactor.core.publisher.Mono;

public interface SocioProxy {

	SocioResponse obtenerSocio(Integer idSocio);
}

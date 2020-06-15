package com.hospedaje.web.ingreso.client;

import com.hospedaje.web.ingreso.dto.response.SocioResponse;

public interface SocioProxy {

	SocioResponse obtenerSocio(Integer idSocio);
}

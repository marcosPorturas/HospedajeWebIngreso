package com.hospedaje.web.ingreso.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospedaje.web.ingreso.dto.response.GetSocioResponse;


@Component
public class SocioProxyImplement implements SocioProxy{

	@Autowired
	private SocioProxy socioProxy;
	
	
	@Override
	public GetSocioResponse obtenerSocio(Integer idSocio) {
		// TODO Auto-generated method stub
		GetSocioResponse getSocioResponse = socioProxy.obtenerSocio(idSocio);
		return getSocioResponse;
	}

}

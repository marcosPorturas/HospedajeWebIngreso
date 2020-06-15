package com.hospedaje.web.ingreso.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospedaje.web.ingreso.client.feign.SocioFeign;
import com.hospedaje.web.ingreso.dto.response.SocioResponse;


@Component
public class SocioProxyImplement implements SocioProxy{

	@Autowired
	private SocioFeign socioProxy;
	
	
	@Override
	public SocioResponse obtenerSocio(Integer idSocio) {
		// TODO Auto-generated method stub
		SocioResponse socioResponse = socioProxy.obtenerSocio(idSocio);
		return socioResponse;
	}

}

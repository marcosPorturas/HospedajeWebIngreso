package com.hospedaje.web.ingreso.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hospedaje.web.ingreso.dto.response.SocioResponse;


@FeignClient(name="socio", url="${url.socio.host}")
public interface SocioFeign {

	@GetMapping("/{id}")
	SocioResponse obtenerSocio(@PathVariable("id")Integer idSocio);
}

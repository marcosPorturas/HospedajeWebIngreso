package com.hospedaje.web.ingreso.client.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hospedaje.web.ingreso.dto.response.ProductoResponse;

@FeignClient(name="producto", url="${url.producto.host}")
public interface ProductoFeign {

	@GetMapping("/listar/{idProductos}")
	List<ProductoResponse> listarProductoXIds(@PathVariable("idProductos")int[] idProductos);
	
}

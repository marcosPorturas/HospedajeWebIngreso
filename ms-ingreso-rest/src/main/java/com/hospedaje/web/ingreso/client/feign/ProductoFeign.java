package com.hospedaje.web.ingreso.client.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospedaje.web.ingreso.dto.request.ProductoConsumo;
import com.hospedaje.web.ingreso.dto.response.ProductoResponse;
import com.hospedaje.web.ingreso.dto.response.ValidarStockResponse;

import reactor.core.publisher.Mono;

@FeignClient(name="producto", url="${url.producto.host}")
public interface ProductoFeign {

	@GetMapping("/listar/{idProductos}")
	List<ProductoResponse> listarProductoXIds(@PathVariable("idProductos")int[] idProductos);
	
	@GetMapping
	Mono<ProductoResponse> obtenerProducto(@RequestParam("idproducto")Integer idSocio,
			@RequestParam("cantidad")Integer cantidad);
	
	@PostMapping("/agotado")
	ValidarStockResponse validarStock(@RequestBody List<ProductoConsumo> lstProductoConsumo);
}

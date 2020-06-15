package com.hospedaje.web.ingreso.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hospedaje.web.ingreso.client.feign.ProductoFeign;
import com.hospedaje.web.ingreso.dto.response.ProductoResponse;

public class ProductoProxyImplement implements ProductoProxy{
	
	@Autowired
	ProductoFeign productoProxy;

	@Override
	public List<ProductoResponse> listarProductoXIds(int[] idProductos) {
		return productoProxy.listarProductoXIds(idProductos);
	}

}

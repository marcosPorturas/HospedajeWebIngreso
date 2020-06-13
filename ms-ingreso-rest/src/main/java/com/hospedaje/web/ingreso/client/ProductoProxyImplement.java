package com.hospedaje.web.ingreso.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hospedaje.web.ingreso.dto.response.ProductoResponse;

public class ProductoProxyImplement implements ProductoProxy{
	
	@Autowired
	ProductoProxy productoProxy;

	@Override
	public List<ProductoResponse> listarProductoXIds(List<Integer> idProductos) {
		return productoProxy.listarProductoXIds(idProductos);
	}

}

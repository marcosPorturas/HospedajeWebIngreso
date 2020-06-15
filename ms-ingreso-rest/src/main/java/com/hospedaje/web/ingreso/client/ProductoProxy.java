package com.hospedaje.web.ingreso.client;

import java.util.List;

import com.hospedaje.web.ingreso.dto.response.ProductoResponse;

public interface ProductoProxy {

	List<ProductoResponse> listarProductoXIds(int[] idProductos);
}

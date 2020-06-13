package com.hospedaje.web.ingreso.dto.response;

import java.util.List;

import com.hospedaje.web.ingreso.dto.request.ProductoRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class ConsumoResponse {
	
	private Integer idIngreso;
	private List<ProductoConsumo> listProducto;
	
	public Integer getIdIngreso() {
		return idIngreso;
	}
	public void setIdIngreso(Integer idIngreso) {
		this.idIngreso = idIngreso;
	}
	public List<ProductoConsumo> getListProducto() {
		return listProducto;
	}
	public void setListProducto(List<ProductoConsumo> listProducto) {
		this.listProducto = listProducto;
	}

}

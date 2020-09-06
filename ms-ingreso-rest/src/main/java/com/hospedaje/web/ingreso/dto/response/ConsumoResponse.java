package com.hospedaje.web.ingreso.dto.response;

import java.util.List;

import com.hospedaje.web.ingreso.dto.request.ProductoConsumo;
import com.hospedaje.web.ingreso.dto.request.ProductoIngreso;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class ConsumoResponse {
	
	private Integer idIngreso;
	private List<ProductoStock> listProducto;
	
	public Integer getIdIngreso() {
		return idIngreso;
	}
	public void setIdIngreso(Integer idIngreso) {
		this.idIngreso = idIngreso;
	}
	public List<ProductoStock> getListProducto() {
		return listProducto;
	}
	public void setListProducto(List<ProductoStock> listProducto) {
		this.listProducto = listProducto;
	}

}

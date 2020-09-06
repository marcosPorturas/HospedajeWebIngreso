package com.hospedaje.web.ingreso.dto.request;

import java.util.List;

public class ConsumoRequest {
	
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

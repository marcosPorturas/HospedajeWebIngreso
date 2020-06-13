package com.hospedaje.web.ingreso.dto.request;

import java.util.List;

public class ConsumoRequest {
	
	private Integer idIngreso;
	private List<ProductoRequest> listProducto;
	
	public Integer getIdIngreso() {
		return idIngreso;
	}
	public List<ProductoRequest> getListProducto() {
		return listProducto;
	}
	public void setIdIngreso(Integer idIngreso) {
		this.idIngreso = idIngreso;
	}
	public void setListProducto(List<ProductoRequest> listProducto) {
		this.listProducto = listProducto;
	}

}

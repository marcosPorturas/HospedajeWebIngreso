package com.hospedaje.web.ingreso.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class ValidarStockResponse {
	
	private List<ProductoStock> almacen;
	
	private List<ProductoStock> agotado;

	public List<ProductoStock> getAlmacen() {
		return almacen;
	}

	public void setAlmacen(List<ProductoStock> almacen) {
		this.almacen = almacen;
	}

	public List<ProductoStock> getAgotado() {
		return agotado;
	}

	public void setAgotado(List<ProductoStock> agotado) {
		this.agotado = agotado;
	}

}

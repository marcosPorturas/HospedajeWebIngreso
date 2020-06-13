package com.hospedaje.web.ingreso.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class ProductoConsumo {
	
	private Integer idProducto;
	private String detalle;
	private Integer cantidad;
	private Double precioUnitario;
	private Double subTotal;
	
	public Integer getIdProducto() {
		return idProducto;
	}
	public String getDetalle() {
		return detalle;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public Double getPrecioUnitario() {
		return precioUnitario;
	}
	public Double getSubTotal() {
		return subTotal;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

}

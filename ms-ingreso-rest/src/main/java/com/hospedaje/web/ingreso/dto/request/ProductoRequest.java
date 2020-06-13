package com.hospedaje.web.ingreso.dto.request;

import java.util.Date;

public class ProductoRequest {

	private Integer idProducto;
	private String detalle;
	private Integer cantidad;
	private Double precioUnitario;
	private Date fechaPedio;
	
	public Integer getIdProducto() {
		return idProducto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public String getDetalle() {
		return detalle;
	}
	public Date getFechaPedio() {
		return fechaPedio;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public void setFechaPedio(Date fechaPedio) {
		this.fechaPedio = fechaPedio;
	}
	public Double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	
}

package com.hospedaje.web.ingreso.dto.response;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;


@Builder
@AllArgsConstructor
public class ProductoResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer idProducto;
	private String detalle;
	private Double precioUnitario;
	
	public Integer getIdProducto() {
		return idProducto;
	}
	public String getDetalle() {
		return detalle;
	}
	public Double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	

	


	
	

}

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
	private Integer stock;
	private Double precioUnitario;
	private Date creationDate;

	
	public ProductoResponse () {
		super();
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public String getDetalle() {
		return detalle;
	}

	public Integer getStock() {
		return stock;
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

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}


	
	

}

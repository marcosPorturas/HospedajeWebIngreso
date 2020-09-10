package com.hospedaje.web.ingreso.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import com.hospedaje.web.ingreso.dto.request.ProductoConsumo;
import com.hospedaje.web.ingreso.dto.response.ProductoStock;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Document(collection="consumo")
@Builder
@AllArgsConstructor
public class Consumo {
	
	@Id
	private String idConsumo;
	
	@Field("id_ingreso")
	private Integer idIngreso;
	
	@Field("list_product")
	private List<ProductoStock> listProductoConsumo;
	
	@Field("total_consumo")
	private Double totalConsumo;

	public String getIdConsumo() {
		return idConsumo;
	}

	public Integer getIdIngreso() {
		return idIngreso;
	}

	public void setIdConsumo(String idConsumo) {
		this.idConsumo = idConsumo;
	}

	public void setIdIngreso(Integer idIngreso) {
		this.idIngreso = idIngreso;
	}

	public List<ProductoStock> getListProductoConsumo() {
		return listProductoConsumo;
	}

	public void setListProductoConsumo(List<ProductoStock> listProductoConsumo) {
		this.listProductoConsumo = listProductoConsumo;
	}

	public Double getTotalConsumo() {
		return totalConsumo;
	}

	public void setTotalConsumo(Double totalConsumo) {
		this.totalConsumo = totalConsumo;
	}

	

	

	


}

package com.hospedaje.web.ingreso.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import com.hospedaje.web.ingreso.dto.request.ProductoRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Document(collection="consumo")
@Builder
@AllArgsConstructor
public class Consumo {
	
	@Id
	private Long idConsumo;
	
	@Field("id_ingreso")
	private Integer idIngreso;
	
	@Field("list_product")
	private List<ProductoRequest> listProduct;

	public Long getIdConsumo() {
		return idConsumo;
	}

	public Integer getIdIngreso() {
		return idIngreso;
	}

	public void setIdConsumo(Long idConsumo) {
		this.idConsumo = idConsumo;
	}

	public void setIdIngreso(Integer idIngreso) {
		this.idIngreso = idIngreso;
	}

	public List<ProductoRequest> getListProduct() {
		return listProduct;
	}

	public void setListProduct(List<ProductoRequest> listProduct) {
		this.listProduct = listProduct;
	}


}

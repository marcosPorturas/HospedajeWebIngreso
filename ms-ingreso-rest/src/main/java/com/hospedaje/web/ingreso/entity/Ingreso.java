package com.hospedaje.web.ingreso.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import com.hospedaje.web.ingreso.dto.response.SocioResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="ingreso")
@Builder
@AllArgsConstructor
public class Ingreso implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private Integer idIngreso;
	
	@Field("socio")
	private SocioResponse socioResponse;
	
	@Field("creation_date")
	private Date creationDate;
	
	@Field("update_date")
	private Date updateDate;
	
	@Field("numero_invitados")
	private Integer numeroInvitados;
	
	@Field("costo_ingreso")
	private Double costoIngreso;
	
	@Field("enabled")
	private boolean enabled;

	public Integer getIdIngreso() {
		return idIngreso;
	}

	public SocioResponse getSocioResponse() {
		return socioResponse;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public Integer getNumeroInvitados() {
		return numeroInvitados;
	}

	public Double getCostoIngreso() {
		return costoIngreso;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setIdIngreso(Integer idIngreso) {
		this.idIngreso = idIngreso;
	}

	public void setSocioResponse(SocioResponse socioResponse) {
		this.socioResponse = socioResponse;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public void setNumeroInvitados(Integer numeroInvitados) {
		this.numeroInvitados = numeroInvitados;
	}

	public void setCostoIngreso(Double costoIngreso) {
		this.costoIngreso = costoIngreso;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}

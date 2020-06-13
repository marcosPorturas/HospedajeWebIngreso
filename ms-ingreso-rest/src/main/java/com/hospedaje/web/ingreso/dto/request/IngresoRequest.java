package com.hospedaje.web.ingreso.dto.request;


public class IngresoRequest {

	private Integer idIngreso;
	private Integer idSocio;
	private Integer numeroInvitados;
	private Double costoIngreso;
	
	public IngresoRequest() {
		super();
	}

	public Integer getIdSocio() {
		return idSocio;
	}

	public void setIdSocio(Integer idSocio) {
		this.idSocio = idSocio;
	}

	public Integer getIdIngreso() {
		return idIngreso;
	}

	public Integer getNumeroInvitados() {
		return numeroInvitados;
	}

	public Double getCostoIngreso() {
		return costoIngreso;
	}

	public void setIdIngreso(Integer idIngreso) {
		this.idIngreso = idIngreso;
	}

	public void setNumeroInvitados(Integer numeroInvitados) {
		this.numeroInvitados = numeroInvitados;
	}

	public void setCostoIngreso(Double costoIngreso) {
		this.costoIngreso = costoIngreso;
	}
	
}

package com.hospedaje.web.ingreso.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IngresoResponse {

	private Integer idIngreso;
	private String datosSocio;
	private String fechaIngreso;
	private String horaIngreso;
	private Integer numeroInvitados;
	private String status;
	
	public Integer getIdIngreso() {
		return idIngreso;
	}
	public void setIdIngreso(Integer idIngreso) {
		this.idIngreso = idIngreso;
	}
	public String getDatosSocio() {
		return datosSocio;
	}
	public void setDatosSocio(String datosSocio) {
		this.datosSocio = datosSocio;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getHoraIngreso() {
		return horaIngreso;
	}
	public void setHoraIngreso(String horaIngreso) {
		this.horaIngreso = horaIngreso;
	}
	public Integer getNumeroInvitados() {
		return numeroInvitados;
	}
	public void setNumeroInvitados(Integer numeroInvitados) {
		this.numeroInvitados = numeroInvitados;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}

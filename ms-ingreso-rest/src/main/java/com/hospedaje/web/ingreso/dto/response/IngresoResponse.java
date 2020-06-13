package com.hospedaje.web.ingreso.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class IngresoResponse {

	private Integer idIngreso;
	private String datosSocio;
	private String fechaIngreso;
	private String horaIngreso;
	private Integer numeroInvitados;
	private boolean enabled;
	
	public Integer getidIngreso() {
		return idIngreso;
	}
	public String getDatosSocio() {
		return datosSocio;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public String getHoraIngreso() {
		return horaIngreso;
	}
	public Integer getNumeroInvitados() {
		return numeroInvitados;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setIdIngreso(Integer idIngreso) {
		this.idIngreso = idIngreso;
	}
	public void setDatosSocio(String datosSocio) {
		this.datosSocio = datosSocio;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public void setHoraIngreso(String horaIngreso) {
		this.horaIngreso = horaIngreso;
	}
	public void setNumeroInvitados(Integer numeroInvitados) {
		this.numeroInvitados = numeroInvitados;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
	
}

package com.hospedaje.web.ingreso.dto.response;

import com.hospedaje.web.ingreso.dto.AuditResponse;
import com.hospedaje.web.ingreso.dto.SocioResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class GetSocioResponse {

	private AuditResponse auditResponse;
	private SocioResponse socioResponse;
	
	public AuditResponse getAuditResponse() {
		return auditResponse;
	}
	public void setAuditResponse(AuditResponse auditResponse) {
		this.auditResponse = auditResponse;
	}
	public SocioResponse getSocioResponse() {
		return socioResponse;
	}
	public void setSocioResponse(SocioResponse socioResponse) {
		this.socioResponse = socioResponse;
	}
	
}

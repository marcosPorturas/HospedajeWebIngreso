package pe.com.peru.ingreso.msingresorest.service;

import io.reactivex.Single;
import pe.com.peru.ingreso.msingresorest.model.AdmissionRequest;
import pe.com.peru.ingreso.msingresorest.model.AdmissionResponse;
import pe.com.peru.ingreso.msingresorest.model.NewAdmissionResponse;

public interface AdmissionService {

    Single<AdmissionResponse> findAdmission(Integer codAdmission,String transactionId);
    Single<NewAdmissionResponse> addAdmission(AdmissionRequest request,String transactionId);
}

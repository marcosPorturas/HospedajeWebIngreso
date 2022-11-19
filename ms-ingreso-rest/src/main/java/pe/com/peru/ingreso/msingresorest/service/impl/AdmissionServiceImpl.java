package pe.com.peru.ingreso.msingresorest.service.impl;

import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.peru.ingreso.msingresorest.model.AdmissionRequest;
import pe.com.peru.ingreso.msingresorest.model.AdmissionResponse;
import pe.com.peru.ingreso.msingresorest.model.NewAdmissionResponse;
import pe.com.peru.ingreso.msingresorest.repository.AdmissionRepository;
import pe.com.peru.ingreso.msingresorest.service.AdmissionService;

@Service
public class AdmissionServiceImpl implements AdmissionService {

    @Autowired
    AdmissionRepository admissionRepository;

    @Override
    public Single<AdmissionResponse> findAdmission(Integer codAdmission,
       String transactionId) {
        return null;
    }

    @Override
    public Single<NewAdmissionResponse> addAdmission(AdmissionRequest request,
       String transactionId) {
        return null;
    }
}

package pe.com.peru.ingreso.msingresorest.controller;


import io.reactivex.Maybe;
import org.springframework.web.bind.annotation.*;
import pe.com.peru.ingreso.msingresorest.model.AdmissionRequest;
import pe.com.peru.ingreso.msingresorest.model.AdmissionResponse;
import pe.com.peru.ingreso.msingresorest.model.NewAdmissionResponse;

@RestController
@RequestMapping("/ingreso")
public class AdmissionController {

    @GetMapping("/obtener")
    public Maybe<AdmissionResponse> findAdmissionResponse(@RequestParam("idAdmission")
      Integer idAdmission, @RequestHeader("TransactionId")String transactionId) {
        return null;
    }

    @PostMapping
    public Maybe<NewAdmissionResponse> addAdmissionResponse(@RequestBody AdmissionRequest admissionRequest,
      @RequestHeader("TransactionId")String transactionId) {
        return null;
    }

}

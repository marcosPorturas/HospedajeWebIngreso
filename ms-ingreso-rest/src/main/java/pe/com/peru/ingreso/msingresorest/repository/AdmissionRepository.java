package pe.com.peru.ingreso.msingresorest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.peru.ingreso.msingresorest.entity.AdmissionEntity;

@Repository
public interface AdmissionRepository extends JpaRepository<AdmissionEntity,Integer> {
}

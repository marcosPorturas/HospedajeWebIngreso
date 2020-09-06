package com.hospedaje.web.ingreso.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hospedaje.web.ingreso.entity.IngresoStatus;

@Repository
@Transactional
public interface IngresoStatusRepository extends ReactiveMongoRepository<IngresoStatus, Integer>{

}

package com.hospedaje.web.ingreso.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.hospedaje.web.ingreso.entity.Ingreso;
import com.hospedaje.web.ingreso.service.IngresoService;

public interface IngresoRepository extends ReactiveMongoRepository<Ingreso,Integer>{

}

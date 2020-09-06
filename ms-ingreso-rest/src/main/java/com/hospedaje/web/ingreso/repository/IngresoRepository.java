package com.hospedaje.web.ingreso.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.hospedaje.web.ingreso.entity.Ingreso;


@Repository
public interface IngresoRepository extends ReactiveMongoRepository<Ingreso,Integer>{

}

package com.hospedaje.web.ingreso.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.hospedaje.web.ingreso.entity.Consumo;

@Repository
public interface ConsumoRepository extends ReactiveMongoRepository<Consumo,Long> {

}

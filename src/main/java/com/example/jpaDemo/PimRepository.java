package com.example.jpaDemo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PimRepository extends CrudRepository<Pim, Integer>{
	Pim findByUpcAndShipDate(@Param("upc") String poNbr, @Param("shipDate") Date shipDate);
}

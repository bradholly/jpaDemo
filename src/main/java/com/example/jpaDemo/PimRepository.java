package com.example.jpaDemo;

import java.sql.Date;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PimRepository extends PagingAndSortingRepository<Pim, Integer>{
	Pim findByUpcAndColorAndSizeAndShipDate(@Param("upc") String poNbr,
			@Param("color") String color,
			@Param("size") String size,
			@Param("shipDate") Date shipDate);
}

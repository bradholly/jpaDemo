package com.example.jpaDemo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LeadTimeRepository extends CrudRepository<LeadTime, Integer>{
	LeadTime findByOrderTypeAndWarehouseAndWalmartDc(
			@Param("orderType") String orderType, 
			@Param("warehouse") String warehouse, 
			@Param("walmartDc") String walmartDc);
	
	List<LeadTime> findByWalmartDc(@Param("walmartDc") String walmartDc);

	List<LeadTime> findByWarehouse(@Param("warehouse") String warehouse);
}

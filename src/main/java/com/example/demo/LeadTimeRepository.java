package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LeadTimeRepository  extends CrudRepository<LeadTime, LeadTimePk>{
	List<LeadTime> findByWarehouse(@Param("warehouse") String warehouse);
}

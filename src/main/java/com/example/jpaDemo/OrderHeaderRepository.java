package com.example.jpaDemo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderHeaderRepository extends PagingAndSortingRepository<OrderHeader, Integer>{
	List<OrderHeader> findByPoNbr(@Param("poNbr") String poNbr);
}

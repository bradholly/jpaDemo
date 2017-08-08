package com.example.jpaDemo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderDetailRepository extends CrudRepository<OrderDetail, Integer>{
	OrderDetail findByOrderNoAndItemNo(@Param("orderNo") Integer orderNo, @Param("itemNo") Integer itemNo);
}

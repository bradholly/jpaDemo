package com.example.jpaDemo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SkuRepository extends PagingAndSortingRepository<Sku, Integer>{

}

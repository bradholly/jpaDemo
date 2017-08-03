package com.example.jpaDemo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SkuRepository extends CrudRepository<Sku, Integer>{

}

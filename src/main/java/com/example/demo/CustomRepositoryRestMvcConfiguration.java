package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
public class CustomRepositoryRestMvcConfiguration  extends RepositoryRestMvcConfiguration {
	
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(LeadTime.class);
        config.exposeIdsFor(OrderDetail.class);
        config.exposeIdsFor(OrderHeader.class);
        
    }
}

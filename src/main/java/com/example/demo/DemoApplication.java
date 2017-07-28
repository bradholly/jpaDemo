package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Import(CustomRepositoryRestMvcConfiguration.class)
@Configuration
@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner demo(LeadTimeRepository leadTimeRepository) {
//		return (args) -> {
//			leadTimeRepository.save(new LeadTime(getNewPk("0003", "06029", "08W"), "Starkville" , "MS", 110, 2, 2, new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()), "brad"));
//			
//			log.info("lead times found with findAll()");
//			log.info("-------------------------------");
//			for(LeadTime leadTime : leadTimeRepository.findAll()) {
//				log.info(leadTime.toString());
//			}
//			
//			
//			
//			
//			
//		};
//	}
	
	
//	@Bean
//	public CommandLineRunner demo(OrderHeaderRepository orderHeaderRepository) {
//		return (args) -> {
//			orderHeaderRepository.save(new OrderHeader(1234));
//			orderHeaderRepository.save(new OrderHeader(4567));
//			log.info("lead times found with findAll()");
//			log.info("-------------------------------");
//			for(OrderHeader orderHeader : orderHeaderRepository.findAll()) {
//				log.info(orderHeader.getOrderNo().toString());
//			}
//			
//			
//			
//			
//			
//		};
//	}
	
	
//	private PkLeadTime getNewPk(String orderType, String walmartDc, String warehouse) {
//		PkLeadTime pkLeadTime = new PkLeadTime();
//		pkLeadTime.setOrderType(orderType);
//		pkLeadTime.setWalmartDc(walmartDc);
//		pkLeadTime.setWarehouse(warehouse);
//		return pkLeadTime;
//	}
}

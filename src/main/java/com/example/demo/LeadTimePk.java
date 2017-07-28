package com.example.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LeadTimePk implements Serializable {
	private static final long serialVersionUID = 7217811681224186896L;
	
	public LeadTimePk(String orderType,
			String warehouse,
			String walmartDc) {
		super();
		this.orderType=orderType;
		this.warehouse=warehouse;
		this.walmartDc=walmartDc;
	}
	
	@Column(name = "order_type", nullable = false)
	private String orderType;
	@Column(name = "warehouse", nullable = false)
	private String warehouse;
	@Column(name = "walmart_dc", nullable = false)
	private String walmartDc;
	
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getWalmartDc() {
		return walmartDc;
	}
	public void setWalmartDc(String walmartDc) {
		this.walmartDc = walmartDc;
	}	
}

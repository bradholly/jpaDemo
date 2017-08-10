package com.example.jpaDemo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lead_time")
public class LeadTime {

	@Id
	@Column(name="lead_time_pk")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer leadTimePk;
	
	@Column(name="order_type")
	private String orderType;
	@Column(name="warehouse")
	private String warehouse;
	@Column(name="walmart_dc")
	private String walmartDc;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="mileage")
	private Integer mileage;
	@Column(name="safety_days")
	private Integer safetyDays;
	@Column(name="ship_lead_time")
	private Integer shipLeadTime;
	@Column(name="created_date")
	private Date createdDate;
	@Column(name="updated_date")
	private Date updatedDate;
	@Column(name="updated_user")
	private String updatedUser;
	
	public Integer getLeadTimePk() {
		return leadTimePk;
	}
	public void setLeadTimePk(Integer leadTimePk) {
		this.leadTimePk = leadTimePk;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getMileage() {
		return mileage;
	}
	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}
	public Integer getSafetyDays() {
		return safetyDays;
	}
	public void setSafetyDays(Integer safetyDays) {
		this.safetyDays = safetyDays;
	}
	public Integer getShipLeadTime() {
		return shipLeadTime;
	}
	public void setShipLeadTime(Integer shipLeadTime) {
		this.shipLeadTime = shipLeadTime;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getUpdatedUser() {
		return updatedUser;
	}
	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}
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

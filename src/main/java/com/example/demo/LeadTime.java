package com.example.demo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="lead_time")
public class LeadTime {

	@EmbeddedId
	private LeadTimePk LeadTimePk;	
	
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
	
//	protected LeadTime() {}
//	
//	public LeadTime (String orderType,
//			String warehouse,
//			String walmartDc,
//			String city,
//			String state,
//			Integer mileage,
//			Integer safetyDays,
//			Integer shipLeadTime,
//			Date createdDate,
//			Date updatedDate,
//			String updatedUser) {
//		this.orderType = orderType;
//		this.warehouse = warehouse;
//		this.walmartDc = walmartDc;
//		this.city = city;
//		this.mileage = mileage;
//		this.safetyDays = safetyDays;
//		this.shipLeadTime = shipLeadTime;
//		this.createdDate = createdDate;
//		this.updatedDate = updatedDate;
//		this.updatedUser = updatedUser;
//	}
	
	@Override
	public String toString() {
		return this.city + this.state;
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
	
	
}

package com.example.demo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_header")
public class OrderHeader {
	@Id
	@Column(name = "order_no")
	private Integer orderNo;
	
	@Column(name = "po_nbr")
	private String poNbr;
	
	@Column(name = "warehouse")
	private String warehouse;
	
	@Column(name = "division")
	private Integer division;

	@Column(name = "customer")
	private Integer customer;

	@Column(name = "walmart_dc")
	private String walmartDc;
	
	@Column(name = "order_type")
	private String orderType;
	
	@Column(name = "order_reference")
	private String orderReference;
	
	@Column(name = "order_date")
	private Date orderDate;
	
	@Column(name = "mab_date")
	private Date mabDate;
	
	@Column(name = "cancel_date")
	private Date cancelDate;
	
	@Column(name = "priority_date")
	private Date priorityDate;

	@Column(name = "ship_on_date")
	private Date shipOnDate;

	@Column(name = "confirm_ship_on_date")
	private Date confirmShipOnDate;
	
	@Column(name = "calc_ship_on_date")
	private Date calcShipOnDate;

	@Column(name = "invoice_date")
	private Date invoiceDate;
	
	@Column(name = "open_flag")
	private String openFlag;
	
	@Column(name = "cancel_flag")
	private String cancelFlag;

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public String getPoNbr() {
		return poNbr;
	}

	public void setPoNbr(String poNbr) {
		this.poNbr = poNbr;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public Integer getDivision() {
		return division;
	}

	public void setDivision(Integer division) {
		this.division = division;
	}

	public Integer getCustomer() {
		return customer;
	}

	public void setCustomer(Integer customer) {
		this.customer = customer;
	}

	public String getWalmartDc() {
		return walmartDc;
	}

	public void setWalmartDc(String walmartDc) {
		this.walmartDc = walmartDc;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderReference() {
		return orderReference;
	}

	public void setOrderReference(String orderReference) {
		this.orderReference = orderReference;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getMabDate() {
		return mabDate;
	}

	public void setMabDate(Date mabDate) {
		this.mabDate = mabDate;
	}

	public Date getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}

	public Date getPriorityDate() {
		return priorityDate;
	}

	public void setPriorityDate(Date priorityDate) {
		this.priorityDate = priorityDate;
	}

	public Date getShipOnDate() {
		return shipOnDate;
	}

	public void setShipOnDate(Date shipOnDate) {
		this.shipOnDate = shipOnDate;
	}

	public Date getConfirmShipOnDate() {
		return confirmShipOnDate;
	}

	public void setConfirmShipOnDate(Date confirmShipOnDate) {
		this.confirmShipOnDate = confirmShipOnDate;
	}

	public Date getCalcShipOnDate() {
		return calcShipOnDate;
	}

	public void setCalcShipOnDate(Date calcShipOnDate) {
		this.calcShipOnDate = calcShipOnDate;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getOpenFlag() {
		return openFlag;
	}

	public void setOpenFlag(String openFlag) {
		this.openFlag = openFlag;
	}

	public String getCancelFlag() {
		return cancelFlag;
	}

	public void setCancelFlag(String cancelFlag) {
		this.cancelFlag = cancelFlag;
	}
	
	protected OrderHeader() {}
	
	public OrderHeader(Integer orderNo) {
		this.setOrderNo(orderNo);
	}
}



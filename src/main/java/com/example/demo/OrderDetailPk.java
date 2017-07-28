package com.example.demo;

import java.io.Serializable;

import javax.persistence.Column;

public class OrderDetailPk implements Serializable {
	private static final long serialVersionUID = 7383774708120376339L;

	@Column(name="order_no", nullable=false)
	private Integer orderNo;
	
	@Column(name="item_no", nullable=false)
	private Integer itemNo;

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public Integer getItemNo() {
		return itemNo;
	}

	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	
	
}

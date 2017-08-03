package com.example.jpaDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_detail")
public class OrderDetail {
	
	@Id
	@Column(name="order_detail_pk")
	private Integer orderDetailPk;
	
	@Column(name="order_no")
	private Integer orderNo;
	
	@Column(name="item_no")
	private Integer itemNo;
	
	@Column(name="ord_qty")
	private Integer ordQty;
	
	@Column(name="open_qty")
	private Integer openQty;
	
	@Column(name="cancel_qty")
	private Integer cancelQty;
	
	@Column(name="alloc_qty")
	private Integer allocQty;
	
	@Column(name="pick_qty")
	private Integer pickQty;
	
	@Column(name="ship_qty")
	private Integer shipQty;

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

	public Integer getOrdQty() {
		return ordQty;
	}

	public void setOrdQty(Integer ordQty) {
		this.ordQty = ordQty;
	}

	public Integer getOpenQty() {
		return openQty;
	}

	public void setOpenQty(Integer openQty) {
		this.openQty = openQty;
	}

	public Integer getCancelQty() {
		return cancelQty;
	}

	public void setCancelQty(Integer cancelQty) {
		this.cancelQty = cancelQty;
	}

	public Integer getAllocQty() {
		return allocQty;
	}

	public void setAllocQty(Integer allocQty) {
		this.allocQty = allocQty;
	}

	public Integer getPickQty() {
		return pickQty;
	}

	public void setPickQty(Integer pickQty) {
		this.pickQty = pickQty;
	}

	public Integer getShipQty() {
		return shipQty;
	}

	public void setShipQty(Integer shipQty) {
		this.shipQty = shipQty;
	}

	public Integer getOrderDetailPk() {
		return orderDetailPk;
	}

	public void setOrderDetailPk(Integer orderDetailPk) {
		this.orderDetailPk = orderDetailPk;
	}
	
	
}

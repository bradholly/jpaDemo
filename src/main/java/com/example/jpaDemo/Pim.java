package com.example.jpaDemo;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pim")
public class Pim {
	@Id
	@Column(name="pim_pk")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pimPk;
	
	@Column(name="upc")
	private String upc;
	@Column(name="pack_qty")
	private Integer packQty;
	@Column(name="ord_qty")
	private Integer ordQty;
	@Column(name="unit_price")
	private BigDecimal unitPrice;
	@Column(name="in_dc_date")
	private Date inDcDate;
	@Column(name="vendor_sku")
	private String vendorSku;
	@Column(name="ship_date")
	private Date shipDate;
	@Column(name="cancel_date")
	private Date cancelDate;
	@Column(name="color")
	private String color;
	@Column(name="size")
	private String size;
	
	
	public Integer getPimPk() {
		return pimPk;
	}

	public void setPimPk(Integer pimPk) {
		this.pimPk = pimPk;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public Integer getPackQty() {
		return packQty;
	}

	public void setPackQty(Integer packQty) {
		this.packQty = packQty;
	}

	public Integer getOrdQty() {
		return ordQty;
	}

	public void setOrdQty(Integer ordQty) {
		this.ordQty = ordQty;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Date getInDcDate() {
		return inDcDate;
	}

	public void setInDcDate(Date inDcDate) {
		this.inDcDate = inDcDate;
	}

	public String getVendorSku() {
		return vendorSku;
	}

	public void setVendorSku(String vendorSku) {
		this.vendorSku = vendorSku;
	}

	public Date getShipDate() {
		return shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	public Date getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}

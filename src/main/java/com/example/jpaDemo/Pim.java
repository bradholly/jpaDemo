package com.example.jpaDemo;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pim")
public class Pim {
	@Id
	@Column(name="pim_pk")
	private Integer pimPk;
	
	@Column(name="contract_id")
	private Integer contractId;
	
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
	
	@Column(name="fine_line")
	private Integer fineLine;

	public Integer getPimPk() {
		return pimPk;
	}

	public void setPimPk(Integer pimPk) {
		this.pimPk = pimPk;
	}

	public Integer getContractId() {
		return contractId;
	}

	public void setContractId(Integer contractId) {
		this.contractId = contractId;
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

	public Integer getFineLine() {
		return fineLine;
	}

	public void setFineLine(Integer fineLine) {
		this.fineLine = fineLine;
	}
	
	
}

package com.example.jpaDemo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sku")
public class Sku {
	@Id
	@Column(name="item_no")
	private Integer itemNo;
	
	@Column(name="season")
	private String season;
	@Column(name="style")
	private String style;
	@Column(name="color")
	private String color;
	@Column(name="dim")
	private String dim;
	@Column(name="size")
	private String size;
	@Column(name="division")
	private Integer division;
	@Column(name="unit_price")
	private BigDecimal unitPrice;	
	@Column(name="upc")
	private String upc;	
	@Column(name="gtin")
	private String gtin;	
	@Column(name="wm_style")
	private String wmStyle;
	@Column(name="wm_item")
	private String wmItem;
	@Column(name="fine_line")
	private Integer fineLine;
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDim() {
		return dim;
	}
	public void setDim(String dim) {
		this.dim = dim;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Integer getDivision() {
		return division;
	}
	public void setDivision(Integer division) {
		this.division = division;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getGtin() {
		return gtin;
	}
	public void setGtin(String gtin) {
		this.gtin = gtin;
	}
	public String getWmStyle() {
		return wmStyle;
	}
	public void setWmStyle(String wmStyle) {
		this.wmStyle = wmStyle;
	}
	public Integer getFineLine() {
		return fineLine;
	}
	public void setFineLine(Integer fineLine) {
		this.fineLine = fineLine;
	}
	public String getWmItem() {
		return wmItem;
	}
	public void setWmItem(String wmItem) {
		this.wmItem = wmItem;
	}
	
	
}

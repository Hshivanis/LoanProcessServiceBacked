package com.wcs.app.jf.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Scheme {
	@Id
	private int schemeId;
	private String schemeName;
	private String schemeDetails;
	private double discountPercent;
	private double discountAmount;
	private String startDate;
	private String endDate;
	public int getSchemeId() {
		return schemeId;
	}
	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}
	public String getSchemeName() {
		return schemeName;
	}
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}
	public String getSchemeDetails() {
		return schemeDetails;
	}
	public void setSchemeDetails(String schemeDetails) {
		this.schemeDetails = schemeDetails;
	}
	public double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	public double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	 

}

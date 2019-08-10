package com.wcs.app.jf.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GST
{
	@Id
	private int GSTId;
	public int getGSTId() {
		return GSTId;
	}
	public void setGSTId(int gSTId) {
		GSTId = gSTId;
	}
	public double getSGST() {
		return SGST;
	}
	public void setSGST(double sGST) {
		SGST = sGST;
	}
	public double getCGST() {
		return CGST;
	}
	public void setCGST(double cGST) {
		CGST = cGST;
	}
	public double getIGST() {
		return IGST;
	}
	public void setIGST(double iGST) {
		IGST = iGST;
	}
	private double SGST;
	private double CGST;
	private double IGST;
}

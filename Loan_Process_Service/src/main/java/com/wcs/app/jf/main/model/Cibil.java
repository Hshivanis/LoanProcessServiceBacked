package com.wcs.app.jf.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Cibil {
@Id
	private int cibilId;
	public int getCibilId() {
	return cibilId;
}
public void setCibilId(int cibilId) {
	this.cibilId = cibilId;
}
public int getLeadId() {
	return leadId;
}
public void setLeadId(int leadId) {
	this.leadId = leadId;
}
public double getCibilScore() {
	return cibilScore;
}
public void setCibilScore(double cibilScore) {
	this.cibilScore = cibilScore;
}
 
public String getCibilScoreDateTime() {
	return cibilScoreDateTime;
}
public void setCibilScoreDateTime(String cibilScoreDateTime) {
	this.cibilScoreDateTime = cibilScoreDateTime;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
	private int leadId;
	private double cibilScore;
	private String cibilScoreDateTime;
	private int status;
	private String remark;

	
}

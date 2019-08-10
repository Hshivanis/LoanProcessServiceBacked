package com.wcs.app.jf.main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Loan_Rescheduler {
	@Id
	private long loanNo;
	public long getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(long loanNo) {
		this.loanNo = loanNo;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getOldTenure() {
		return oldTenure;
	}
	public void setOldTenure(int oldTenure) {
		this.oldTenure = oldTenure;
	}
	public double getOldEMI() {
		return oldEMI;
	}
	public void setOldEMI(double oldEMI) {
		this.oldEMI = oldEMI;
	}
	public double getRemainingAmount() {
		return remainingAmount;
	}
	public void setRemainingAmount(double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}
	public int getNewTenure() {
		return newTenure;
	}
	public void setNewTenure(int newTenure) {
		this.newTenure = newTenure;
	}
	public double getNewEMI() {
		return newEMI;
	}
	public void setNewEMI(double newEMI) {
		this.newEMI = newEMI;
	}
	public double getNewRateOfInterest() {
		return newRateOfInterest;
	}
	public void setNewRateOfInterest(double newRateOfInterest) {
		this.newRateOfInterest = newRateOfInterest;
	}
	public int getProcessingCharge() {
		return processingCharge;
	}
	public void setProcessingCharge(int processingCharge) {
		this.processingCharge = processingCharge;
	}
	public Date getDateOfRescheduling() {
		return dateOfRescheduling;
	}
	public void setDateOfRescheduling(Date dateOfRescheduling) {
		this.dateOfRescheduling = dateOfRescheduling;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	private double loanAmount;
	private int oldTenure;
	private double oldEMI;
	private double remainingAmount;
	private int newTenure;
	private double newEMI;
	private double newRateOfInterest;
	private int processingCharge;
	private Date dateOfRescheduling;
	private int statusCode;
 
	

}

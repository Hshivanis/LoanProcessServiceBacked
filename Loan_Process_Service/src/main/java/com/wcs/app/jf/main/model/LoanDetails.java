package com.wcs.app.jf.main.model;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
 @Entity
public class LoanDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int loanId;
	private String loanCode;
	private int customerId;
	private int leadId;
	private int dealerId;
	private double onRoadPrice;
	private double loanAmount;
	private double rateOfInterest;
	private int status;
	private String statusName;
public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	//@OneToOne
//	private Vehicle_Details vehicle; 
	private int tenure;
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getMarginMoney() {
		return marginMoney;
	}
	public void setMarginMoney(double marginMoney) {
		this.marginMoney = marginMoney;
	}
	public double getAdvanceEMI() {
		return advanceEMI;
	}
	public void setAdvanceEMI(double advanceEMI) {
		this.advanceEMI = advanceEMI;
	}
	public double getSecondYearInsurance() {
		return secondYearInsurance;
	}
	public void setSecondYearInsurance(double secondYearInsurance) {
		this.secondYearInsurance = secondYearInsurance;
	}
	public double getExShowroomPrice() {
		return exShowroomPrice;
	}
	public void setExShowroomPrice(double exShowroomPrice) {
		this.exShowroomPrice = exShowroomPrice;
	}
	public double getDownPayment() {
		return downPayment;
	}
	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}
	public double getProcessingFees() {
		return processingFees;
	}
	public void setProcessingFees(double processingFees) {
		this.processingFees = processingFees;
	}
	public double getTotalInterest() {
		return totalInterest;
	}
	public void setTotalInterest(double totalInterest) {
		this.totalInterest = totalInterest;
	}
	public double getAmountPayToDealer() {
		return amountPayToDealer;
	}
	public void setAmountPayToDealer(double amountPayToDealer) {
		this.amountPayToDealer = amountPayToDealer;
	}
	public String getSanctionDate() {
		return sanctionDate;
	}
	public void setSanctionDate(String sanctionDate) {
		this.sanctionDate = sanctionDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	private double marginMoney;
	private double advanceEMI;
	private double secondYearInsurance;
	private double exShowroomPrice;
	private double downPayment;
	private double processingFees; 
	private double totalInterest;
	private double amountPayToDealer;
	private String sanctionDate;
	private String remark;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoanCode() {
		return loanCode;
	}
	public void setLoanCode(String loanCode) {
		this.loanCode = loanCode;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getLeadId() {
		return leadId;
	}
	public void setLeadId(int leadId) {
		this.leadId = leadId;
	}
	public int getDealerId() {
		return dealerId;
	}
	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}
	public double getOnRoadPrice() {
		return onRoadPrice;
	}
	public void setOnRoadPrice(double onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
//	public Vehicle_Details getVehicle() {
//		return vehicle;
//	}
//	public void setVehicle(Vehicle_Details vehicle) {
//		this.vehicle = vehicle;
//	}
//	public int getTenure() {
//	return tenure;
//	}
//	public void setTenure(int tenure) {
//		this.tenure = tenure;
//	}
//	public double getMarginMoney() {
//		return marginMoney;
//	}
//	public void setMarginMoney(double marginMoney) {
//		this.marginMoney = marginMoney;
//	}
//	public double getAdvanceEMI() {
//		return advanceEMI;
//	}
//	public void setAdvanceEMI(double advanceEMI) {
//		this.advanceEMI = advanceEMI;
//	}
//	public double getSecondYearInsurance() {
//		return secondYearInsurance;
//	}
//	public void setSecondYearInsurance(double secondYearInsurance) {
//		this.secondYearInsurance = secondYearInsurance;
//	}
//	public double getExShowroomPrice() {
//		return exShowroomPrice;
//	}
//	public void setExShowroomPrice(double exShowroomPrice) {
//		this.exShowroomPrice = exShowroomPrice;
//	}
//	public double getDownPayment() {
//		return downPayment;
//	}
//	public void setDownPayment(double downPayment) {
//		this.downPayment = downPayment;
//	}
//	public double getProcessingFees() {
//		return processingFees;
//	}
//	public void setProcessingFees(double processingFees) {
//		this.processingFees = processingFees;
//	}
//	public double getTotalInterest() {
//		return totalInterest;
//	}
//	public void setTotalInterest(double totalInterest) {
//		this.totalInterest = totalInterest;
//	}
//	public double getAmountPayToDealer() {
//		return amountPayToDealer;
//	}
//	public void setAmountPayToDealer(double amountPayToDealer) {
//		this.amountPayToDealer = amountPayToDealer;
//	}
//	 
//	public String getSanctionDate() {
//		return sanctionDate;
//	}
//	public void setSanctionDate(String sanctionDate) {
//		this.sanctionDate = sanctionDate;
//	}
//	public String getRemark() {
//		return remark;
//	}
//	public void setRemark(String remark) {
//		this.remark = remark;
//	}
	public int getSchemeId() {
		return schemeId;
	}
	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}
	public int getLoanStatusId() {
		return loanStatusId;
	}
	public void setLoanStatusId(int loanStatusId) {
		this.loanStatusId = loanStatusId;
	}
	private int schemeId;
	private int loanStatusId;

}

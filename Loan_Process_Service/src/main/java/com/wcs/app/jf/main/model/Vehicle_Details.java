package com.wcs.app.jf.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vehicle_Details
{
	@Id
private int bikeId;
private String bikeBrand;
private String bikeModel;
private String bikeName;
private double bikeOnRoadPrice;
private double bikeActualPrice;
@OneToOne
private Scheme scheme;
public int getBikeId() {
	return bikeId;
}
public void setBikeId(int bikeId) {
	this.bikeId = bikeId;
}
public String getBikeBrand() {
	return bikeBrand;
}
public void setBikeBrand(String bikeBrand) {
	this.bikeBrand = bikeBrand;
}
public String getBikeModel() {
	return bikeModel;
}
public void setBikeModel(String bikeModel) {
	this.bikeModel = bikeModel;
}
public String getBikeName() {
	return bikeName;
}
public void setBikeName(String bikeName) {
	this.bikeName = bikeName;
}
public double getBikeOnRoadPrice() {
	return bikeOnRoadPrice;
}
public void setBikeOnRoadPrice(double bikeOnRoadPrice) {
	this.bikeOnRoadPrice = bikeOnRoadPrice;
}
public double getBikeActualPrice() {
	return bikeActualPrice;
}
public void setBikeActualPrice(double bikeActualPrice) {
	this.bikeActualPrice = bikeActualPrice;
}
public Scheme getScheme() {
	return scheme;
}
public void setScheme(Scheme scheme) {
	this.scheme = scheme;
}
public int getBikeCc() {
	return bikeCc;
}
public void setBikeCc(int bikeCc) {
	this.bikeCc = bikeCc;
}
private int bikeCc;
}

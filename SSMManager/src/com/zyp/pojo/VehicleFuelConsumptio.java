package com.zyp.pojo;

import java.util.Date;

public class VehicleFuelConsumptio {
   private int id ;
   private int carId ;
   private String licensePlate ;
   private String models ;
   private Date comeTime ;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCarId() {
	return carId;
}
public void setCarId(int carId) {
	this.carId = carId;
}
public String getLicensePlate() {
	return licensePlate;
}
public void setLicensePlate(String licensePlate) {
	this.licensePlate = licensePlate;
}
public String getModels() {
	return models;
}
public void setModels(String models) {
	this.models = models;
}
public Date getComeTime() {
	return comeTime;
}
public void setComeTime(Date comeTime) {
	this.comeTime = comeTime;
}
}

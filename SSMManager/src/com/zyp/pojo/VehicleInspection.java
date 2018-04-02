package com.zyp.pojo;

import java.util.Date;

public class VehicleInspection {
 private int id ;
 private int carId ;
 private String licensePlate ;
 private Date carefulTime ;
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
public Date getCarefulTime() {
	return carefulTime;
}
public void setCarefulTime(Date carefulTime) {
	this.carefulTime = carefulTime;
}
}

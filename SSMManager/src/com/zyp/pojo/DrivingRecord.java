package com.zyp.pojo;

import java.util.Date;

public class DrivingRecord {
   private int id ;
   private int carId ;
   private String origin ;
   private String destination ;
   private Date time ;
   private float road ;
   private float speed ;
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
public String getOrigin() {
	return origin;
}
public void setOrigin(String origin) {
	this.origin = origin;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public Date getTime() {
	return time;
}
public void setTime(Date time) {
	this.time = time;
}
public float getRoad() {
	return road;
}
public void setRoad(float road) {
	this.road = road;
}
public float getSpeed() {
	return speed;
}
public void setSpeed(float speed) {
	this.speed = speed;
}
   
}

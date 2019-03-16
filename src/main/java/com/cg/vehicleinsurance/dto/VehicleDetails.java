package com.cg.vehicleinsurance.dto;

import java.sql.Date;

public class VehicleDetails {
	
	private String VehicleNo;
	
	private int vehicleType,insurancePeriod;
	private long aadharNo,mobileNo,noOfDaysLeft;
	private Date registraionDate,RenewelDate;

	
	public String getVehicleNo() {
		return VehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		VehicleNo = vehicleNo;
	}
	public int getVehicleType() {
		return vehicleType;
	}
	public long getNoOfDaysLeft() {
		return noOfDaysLeft;
	}
	public void setNoOfDaysLeft(long noOfDaysLeft) {
		this.noOfDaysLeft = noOfDaysLeft;
	}
	public void setVehicleType(int vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getInsurancePeriod() {
		return insurancePeriod;
	}
	public void setInsurancePeriod(int insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Date getRegistraionDate() {
		return registraionDate;
	}
	public void setRegistraionDate(Date registraionDate) {
		this.registraionDate = registraionDate;
	}
	public Date getRenewelDate() {
		return RenewelDate;
	}
	public void setRenewelDate(Date renewelDate) {
		RenewelDate = renewelDate;
	}
	
	

}

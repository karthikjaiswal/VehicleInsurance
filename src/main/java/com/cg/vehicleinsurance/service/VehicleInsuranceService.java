package com.cg.vehicleinsurance.service;

import java.sql.Date;

import com.cg.vehicleinsurance.dto.VehicleDetails;

public interface VehicleInsuranceService {

	
	VehicleDetails registerVehicle(VehicleDetails vehicleDetails);
	VehicleDetails checkInsuranceValidity(String vehicleNo);
	 boolean validateAadhar(long aadhar);
	 boolean validateMobileNo(long mobile);
	 Date calculateRenewelDate(java.util.Date date,int noOfDays);
}

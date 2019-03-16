package com.cg.vehicleinsurance.dao;

import java.sql.Date;

import com.cg.vehicleinsurance.dto.VehicleDetails;

public interface VehicleInsuranceDao {

	VehicleDetails registerVehicle(VehicleDetails vehicleDetails);
	VehicleDetails checkInsuranceValidity(String vehicleNo);
	long calculateNoOfDaysLeft(Date registerDate, Date renewalDate);
}

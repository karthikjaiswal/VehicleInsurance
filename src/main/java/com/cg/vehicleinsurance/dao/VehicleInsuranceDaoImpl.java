package com.cg.vehicleinsurance.dao;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import com.cg.vehicleinsurance.dto.VehicleDetails;

public class VehicleInsuranceDaoImpl implements VehicleInsuranceDao{

	Map<String,VehicleDetails> insuranceEntry=new HashMap<String, VehicleDetails>();;
	
	public VehicleDetails registerVehicle(VehicleDetails vehicleDetails) {
		VehicleDetails vehicleDetails2=new VehicleDetails();
		
		vehicleDetails2=vehicleDetails;
		
		insuranceEntry.put(vehicleDetails.getVehicleNo(), vehicleDetails2);
	
		return vehicleDetails2;
	}

	public VehicleDetails checkInsuranceValidity(String vehicleNo) {
		
		VehicleDetails vehicleDetails=new VehicleDetails();
		
		for(Map.Entry<String, VehicleDetails> veEntry: insuranceEntry.entrySet())
		{
			if(veEntry.getKey().equals(vehicleNo))
			{
				vehicleDetails=veEntry.getValue();
				
				Date registerDate=vehicleDetails.getRegistraionDate();
				Date renewalDate=vehicleDetails.getRenewelDate();
				
				vehicleDetails.setNoOfDaysLeft(calculateNoOfDaysLeft(registerDate, renewalDate));
				break;
			}
		}
		return vehicleDetails;
	}

	@Override
	public long calculateNoOfDaysLeft(Date registerDate, Date renewalDate) {
		long noOfDays=0;
		
		long diff=renewalDate.getTime()-registerDate.getTime();
		noOfDays=(diff/(1000*60*60*24));
		
		return noOfDays;
	}
	

}

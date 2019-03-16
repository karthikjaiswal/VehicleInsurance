package com.cg.vehicleinsurance.service;

import java.sql.Date;
import java.time.LocalDate;
import com.cg.vehicleinsurance.dao.VehicleInsuranceDao;
import com.cg.vehicleinsurance.dao.VehicleInsuranceDaoImpl;
import com.cg.vehicleinsurance.dto.VehicleDetails;

public class VehicleInsuranceServiceImpl implements VehicleInsuranceService{

	VehicleInsuranceDao vehicleInsuranceDao=new VehicleInsuranceDaoImpl();
	
	public VehicleDetails registerVehicle(VehicleDetails vehicleDetails) {

		VehicleDetails veDetails=null;
			
			if(validateAadhar(vehicleDetails.getAadharNo()))
			{
				if(validateMobileNo(vehicleDetails.getMobileNo()))
				{
					vehicleDetails.setRegistraionDate(Date.valueOf(LocalDate.now()));
					int noOfDays=vehicleDetails.getInsurancePeriod()*365;
					vehicleDetails.setNoOfDaysLeft(noOfDays);
					
					vehicleDetails.setRenewelDate(calculateRenewelDate(vehicleDetails.getRegistraionDate(), noOfDays));
					
					veDetails=vehicleInsuranceDao.registerVehicle(vehicleDetails);
				}
			}
	
			
		return veDetails;
		
	}

	public VehicleDetails checkInsuranceValidity(String vehicleNo) {
		
		return vehicleInsuranceDao.checkInsuranceValidity(vehicleNo);
		
	}
	
	public Date calculateRenewelDate(java.util.Date date,int noOfDays) {
		Date renewalDate = null;
		
		
	
		return renewalDate;
	}
	
	public boolean validateAadhar(long aadhar) {
		String mob=String.valueOf(aadhar);
		if(mob.length()==12)
			return true;
		else
			return false;
	}

	public boolean validateMobileNo(long mobile) {
		
		String mob=String.valueOf(mobile);
		if(mob.length()==10)
			return true;
		else
			return false;
	
	}
	

}

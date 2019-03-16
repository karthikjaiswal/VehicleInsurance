package com.cg.vehicleinsurance.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.vehicleinsurance.dto.VehicleDetails;

class VehicleInsuranceDaoImplTest {

	static VehicleInsuranceDaoImpl vehicleDao;
	static VehicleDetails vehicleDetails;
	@BeforeAll
	public static void init()
	{
		vehicleDao=new VehicleInsuranceDaoImpl();
		vehicleDetails=new VehicleDetails();
	}
	
	
	@Test
	void testRegisterVehicle() {
			
		vehicleDetails.setVehicleNo("TS6833");
		vehicleDetails.setVehicleType(2);
		vehicleDetails.setInsurancePeriod(1);
		vehicleDetails.setAadharNo(784578457856l);
		vehicleDetails.setMobileNo(9845657865l);
		 
		assertEquals("TS6833", (vehicleDao.registerVehicle(vehicleDetails).getVehicleNo()));
	}

	@Test
	void testCheckInsuranceValidity() {

		assertEquals("2019-03-16", (vehicleDao.checkInsuranceValidity("TS6833").getRegistraionDate()));
	}

}

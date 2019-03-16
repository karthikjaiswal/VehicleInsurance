package com.cg.vehicleinsurance.ui;

import java.util.Scanner;

import com.cg.vehicleinsurance.dto.VehicleDetails;
import com.cg.vehicleinsurance.exceptions.InvalidVehicleDetailsException;
import com.cg.vehicleinsurance.exceptions.InvalidVehicleNoException;
import com.cg.vehicleinsurance.service.VehicleInsuranceService;
import com.cg.vehicleinsurance.service.VehicleInsuranceServiceImpl;

public class VehicleInsurance {

	public static void main(String[] args) {
		
		VehicleInsuranceService vehicleInsuranceService=new VehicleInsuranceServiceImpl();
		Scanner scanner=new Scanner(System.in);
		VehicleDetails vehicleDetails=new VehicleDetails();
		
		while(true)
		{
		System.out.println("=======Vehicle Insurance=======");
		System.out.println("1.Vehicle Registration \n2.Insurance Validity check \n3.exit");
		int option=scanner.nextInt();
		
		switch(option)
		{
		case 1:
				System.out.println("Enter vehicle number:");
				vehicleDetails.setVehicleNo(scanner.next());
				
				System.out.println("Enter vehicle type(ex-2 wheeler):");
				vehicleDetails.setVehicleType(scanner.nextInt());
				
				System.out.println("Enter Insurance Period(in years):");
				vehicleDetails.setInsurancePeriod(scanner.nextInt());
				
				System.out.println("Enter aadhar card number:");
				vehicleDetails.setAadharNo(scanner.nextLong());
				
				System.out.println("Enter mobile number:");
				vehicleDetails.setMobileNo(scanner.nextLong());
				
				VehicleDetails veDetails=vehicleInsuranceService.registerVehicle(vehicleDetails);
				
				if(veDetails!=null)
					System.out.println("Vehicle Registered successfully on :"+veDetails.getRegistraionDate());
				else
					try {
						throw new InvalidVehicleDetailsException();
					} catch (InvalidVehicleDetailsException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
					}
			
			break;
		case 2:
				System.out.println("Enter the vehicle number");
				
				VehicleDetails veDdetails2=vehicleInsuranceService.checkInsuranceValidity(scanner.next());
				
				if(veDdetails2!=null)
				{
					System.out.println("Vehicle Type:"+veDdetails2.getVehicleType()+"wheeler");
					System.out.println("Insurance registration date is:"+veDdetails2.getRegistraionDate());
					System.out.println("Insurance renewal date is:"+veDdetails2.getRenewelDate());
					System.out.println("No of days left for renewal:"+veDdetails2.getNoOfDaysLeft());
					
				}
				else
				{
					try {
						throw new InvalidVehicleNoException();
					} catch (InvalidVehicleNoException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}
				}
			
			
			break;
		case 3:
			scanner.close();
			System.exit(0);
			break;
		
			
		}
		
		}
	}
}

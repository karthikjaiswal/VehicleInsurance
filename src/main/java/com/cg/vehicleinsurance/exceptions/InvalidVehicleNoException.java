package com.cg.vehicleinsurance.exceptions;

public class InvalidVehicleNoException extends Exception{

	public InvalidVehicleNoException()
	{
		System.err.println("Invalid Insurance for the vehicle number");
	}
}

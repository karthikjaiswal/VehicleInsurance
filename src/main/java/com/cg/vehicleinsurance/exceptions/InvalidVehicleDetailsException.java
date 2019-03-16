package com.cg.vehicleinsurance.exceptions;

public class InvalidVehicleDetailsException extends Exception{

	public InvalidVehicleDetailsException()
	{
		System.err.println("ERROR Registering: Invalid vehicle details");
		
	}
}

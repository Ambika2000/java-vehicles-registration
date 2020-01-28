package com.javainuse.dao;

import java.util.List;

import com.javainuse.model.Vehicle;

public interface VehicleDao 
{
	void insertVehicle(Vehicle cus);
	void insertVehicles(List<Vehicle> vehicles);
	List<Vehicle> getAllVehicles();
	Vehicle getbyVNumber(String VNumber);
	List<Vehicle> getbyRTOCODE(String RTOCODE);
	List<Vehicle> getbyRTOCount(int RTOCount);
	List<Vehicle> getbyStatusCode(String StatusCode);
	List<Vehicle> getbyVType(String VType);
}

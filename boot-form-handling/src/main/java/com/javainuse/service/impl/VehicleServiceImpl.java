package com.javainuse.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainuse.dao.VehicleDao;
import com.javainuse.model.Vehicle;
import com.javainuse.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleDao vehicleDao;

	@Override
	public void insertVehicle(Vehicle vehicle) {
		vehicleDao.insertVehicle(vehicle);
	}

	@Override
	public void insertVehicles(List<Vehicle> vehicles) {
		vehicleDao.insertVehicles(vehicles);
	}

	public List<Vehicle> getAllVehicles() {
		return vehicleDao.getAllVehicles();
	}



}
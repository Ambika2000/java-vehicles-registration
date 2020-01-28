package com.javainuse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.javainuse.model.Vehicle;
import com.javainuse.service.VehicleService;

@Controller
public class VehicleController {

	@Autowired
	VehicleService vehicleService;

	@RequestMapping("/welcome")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}

	@RequestMapping(value = "/addNewVehicle", method = RequestMethod.GET)
	public ModelAndView show() {
		return new ModelAndView("addVehicle", "v", new Vehicle());
	}

	@RequestMapping(value = "/addNewVehicle", method = RequestMethod.POST)
	public ModelAndView processRequest(@ModelAttribute("v") Vehicle v) {
		
		vehicleService.insertVehicle(v);
		List<Vehicle> vehicles = vehicleService.getAllVehicles();
		ModelAndView model = new ModelAndView("getVehicles");
		model.addObject("vehicles", vehicles);
		return model;
	}

	@RequestMapping("/getVehicles")
	public ModelAndView getVehicles() {
		List<Vehicle> vehicles = vehicleService.getAllVehicles();
		ModelAndView model = new ModelAndView("getVehicles");
		model.addObject("vehicles", vehicles);
		return model;
	}
	@RequestMapping(value= "/getbyRTOCODE", method = RequestMethod.GET)

	public ModelAndView getbyRTOCODE()

	{
		return new ModelAndView("getbyRTOCODE");
	}

	
	@RequestMapping(value= "/getbyRTOCODE", method = RequestMethod.POST)
	public ModelAndView getbyRTOCODE(@RequestParam("RTO_Code") String RTO_Code)
	{

		Vehicle t = vehicleService.getbyRTOCODE(RTO_Code);
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(t);
		ModelAndView model = new ModelAndView("putbyRTOCODE");
		model.addObject("vehicles", vehicles);
		return model;

	}
	@RequestMapping(value= "/getbyRTOCount", method = RequestMethod.GET)

	public ModelAndView getbyRTOCount()

	{
		return new ModelAndView("getbyRTOCount");
	}

	
	@RequestMapping(value= "/getbyRTOCount", method = RequestMethod.POST)
	public ModelAndView getbyRTOCount(@RequestParam("RTOCount") String RTOCount)
	{

		Vehicle t = vehicleService.getbyRTOCount(RTOCount);
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(t);
		ModelAndView model = new ModelAndView("putbyRTOCount");
		model.addObject("vehicles", vehicles);
		return model;

	}
	@RequestMapping(value= "/getbyStatusCode", method = RequestMethod.GET)

	public ModelAndView getbyStatusCode()

	{
		return new ModelAndView("getbyStatusCode");
	}

	
	@RequestMapping(value= "/getbyStatusCode", method = RequestMethod.POST)
	public ModelAndView getbyStatusCode(@RequestParam("StatusCode") String StatusCode)
	{

		Vehicle t = vehicleService.getbyRTOCount(StatusCode);
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(t);
		ModelAndView model = new ModelAndView("putbyStatusCode");
		model.addObject("vehicles", vehicles);
		return model;

	}
	@RequestMapping(value= "/getbyVNumber", method = RequestMethod.GET)

	public ModelAndView getbyVNumber()

	{
		return new ModelAndView("getbyVNumber");
	}

	
	@RequestMapping(value= "/getbyVNumber", method = RequestMethod.POST)
	public ModelAndView getbyVnumber(@RequestParam("VNumber") String VNumber)
	{

		Vehicle t = vehicleService.getbyVNumber(VNumber);
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(t);
		ModelAndView model = new ModelAndView("putbyVNumber");
		model.addObject("vehicles", vehicles);
		return model;

	}
	@RequestMapping(value= "/getbyVType", method = RequestMethod.GET)

	public ModelAndView getbyVType()

	{
		return new ModelAndView("getbyVType");
	}

	
	@RequestMapping(value= "/getbyVType", method = RequestMethod.POST)
	public ModelAndView getbyVType(@RequestParam("VType") String VType)
	{

		Vehicle t = vehicleService.getbyVType(VType);
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(t);
		ModelAndView model = new ModelAndView("putbyVType");
		model.addObject("vehicles", vehicles);
		return model;

	}


}

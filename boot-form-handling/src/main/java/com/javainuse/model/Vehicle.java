package com.javainuse.model;

public class Vehicle {

	private String Number;
	private String State_Code;
	private int RTO_Code;
	private int RTO_Count;
	private String Vehicle_Type;

	public String getNumber() {
		return Number;
	}

	public void setNumber(String Number) {
		this.Number=Number;
	}
	
	public String getState_Code() {
		return State_Code;
	}
	
	public void setState_Code(String State_Code) {
		this.State_Code = State_Code;
	}

	public int getRTO_Code() {
		return RTO_Code;
	}
	
	public void setRTO_Code(int RTO_Code) {
		this.RTO_Code = RTO_Code;
	}
	
	public int getRTO_Count() {
		return RTO_Count;
	}
	
	public void setRTO_Count(int RTO_Count) {
		this.RTO_Count = RTO_Count;
	}

	public String getVehicle_Type() {
		return Vehicle_Type;
	}

	public void setVehicle_Type(String Vehicle_Type) {
		this.Vehicle_Type=Vehicle_Type;
	}
	
	@Override
	public String toString() {
		return "Vehicle [Number=" + Number + ", State Code=" + State_Code + ", RTO Code=" +RTO_Code  + ", RTO Count=" + RTO_Count + ", Vehicle Type="+ Vehicle_Type + "]";
	}

}
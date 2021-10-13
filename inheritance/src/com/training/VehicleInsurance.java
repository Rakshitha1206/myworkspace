package com.training;

public class VehicleInsurance extends Insurance {

	 private String vehicleType;

	public VehicleInsurance() {
		super();
		System.out.println("Inside sub class 0 parameter constructor");
		// TODO Auto-generated constructor stub
	}

	public VehicleInsurance(int policyNo, String policyHolderName, double policyAmount, String vehicleType) {
		super(policyNo, policyHolderName, policyAmount);
		System.out.println("Inside sub class 4 param constructor");
		this.vehicleType = vehicleType;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "VehicleInsurance [vehicleType=" + vehicleType + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium=100;
	
		switch (vehicleType.toLowerCase()) {
		case "car":
			if(getPolicyAmount()>=50000)
			{
				premium=1000;
			}
			break;
		case "bike":
			if(getPolicyAmount()>=50000)
			{
				premium=1000;
			}
			break;
			
	}
		return premium;
	}

	
	 
}

package com.training;

public class Insurance {

	private int policyNo;
	private String policyHolderName;
	private double policyAmount;
	public Insurance() {
		super();
		System.out.println("Inside SUPER class 0 parameter constuctor");
		// TODO Auto-generated constructor stub
	}
	public Insurance(int policyNo, String policyHolderName, double policyAmount) {
		super();
		System.out.println("Inside SUPER class 3 parameter");
		this.policyNo = policyNo;
		this.policyHolderName = policyHolderName;
		this.policyAmount = policyAmount;
	}
	public int getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public double getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}
	@Override
	public String toString() {
		return "Insurance [policyNo=" + policyNo + ", policyHolderName=" + policyHolderName + ", policyAmount="
				+ policyAmount + "]";
	}
	public double calculatePremium() {
		double premium = 5000.00;
		if(this.policyAmount>100000) {
			premium = 10000;
		}
		return premium;
		}
}


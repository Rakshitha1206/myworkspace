package com.example.lehay;

public class BankAccount {

	private double balance;
	public synchronized double deposit(double amount) {
	
		this.balance = this.balance+amount;
		notifyAll();
		return this.balance;
	}
	public synchronized double withdraw(double amount) {
		if(this.balance < amount) {
			
			try {
				System.out.println("Waiting for amount transfer");
				wait();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
			
		
		this.balance = this.balance-amount;
		return this.balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

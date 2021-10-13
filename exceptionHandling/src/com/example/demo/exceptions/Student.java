package com.example.demo.exceptions;

//Data Hiding - Hiding variables
//Provide Interface -> Set/Get to access the varibles
public class Student {
	
	private int rollNumber;
	private String studentName;
	private double markScored;
	private String email;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int rollNumber, String studentName, double markScored, String email) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.markScored = markScored;
		this.email = email;
	}


	public int getRollNumber() {
		return rollNumber;
	}


	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public double getMarkScored() {
		return markScored;
	}

// Since RangeCheckException is Exception its a Checked Exception
	//so it has to follow  handle or declare rule
	// In the following we are declaring using throws clause
	public void setMarkScored(double markScored)throws RangeCheckExcpetion {
		if(markScored>0 && markScored<=100)
		{
			this.markScored = markScored;
			
		}
		else {
			throw new RangeCheckExcpetion("Invalid mark entered should be [0-100]");
		}
		
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", markScored=" + markScored
				+ ", email=" + email + "]";
	}
	

}


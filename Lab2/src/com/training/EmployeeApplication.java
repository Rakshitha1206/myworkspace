package com.training;

public class EmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee e1= new Employee();
        e1.setEmployeeId(102);
        e1.setEmployeeName("Rakshitha");
        e1.setSalary(4000);
        
        
        System.out.println(e1.getEmployeeName());
        System.out.println(e1.getSalary());
        
        
       Employee det = new Employee(103,"Shyam",7000);
        
        System.out.println(det.getEmployeeId());
        System.out.println(det.getSalary());
        
	}

}

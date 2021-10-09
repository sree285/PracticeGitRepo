package com.practice;

public class StaticMain {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId("1");
		e.setEmpName("sree");
		e.setGrade("a");
		e.setSalary(2500);
		System.out.println("Employee:"+e.getEmpId()+" "+e.getEmpName()+" "+Employee.getCompany());
		
	}

}

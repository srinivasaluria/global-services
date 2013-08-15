package com.smsc;

public class Employee {
	
	private String empId;
	private String empName;
	
	public Employee()
	{
		this.empId = "1008";
		this.empName = "xyz";
	}
	
	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}


	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}


	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}


	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println("empId : " + employee.getEmpId());
		System.out.println("empName : " + employee.getEmpName());
		
	}

}

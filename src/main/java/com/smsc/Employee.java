package com.smsc;

public class Employee {
	
	private String empId;
	private String empName;
	private String empDesc;
	
	public Employee()
	{
		this.empId = "1008";
		this.empName = "xyz";
		this.empDesc = "Trainee";
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

	/**
	 * @return the empDesc
	 */
	public String getEmpDesc() {
		return empDesc;
	}

	/**
	 * @param empDesc the empDesc to set
	 */
	public void setEmpDesc(String empDesc) {
		this.empDesc = empDesc;
	}

	public static void main(String[] args) {
		
	}

}

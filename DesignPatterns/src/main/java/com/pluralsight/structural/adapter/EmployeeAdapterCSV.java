package com.pluralsight.structural.adapter;

public class EmployeeAdapterCSV implements Employee {

	private EmployeeCSV instance;
	
	public EmployeeAdapterCSV(EmployeeCSV instance) {
		this.instance = instance;
	}
	
	public String getId() {
		return instance.getId() + "";
	}

	public String getFirstName() {
		return instance.getFirstname();
	}

	public String getLastName() {
		return instance.getLastname();
	}

	public String getEmail() {
		return instance.getEmailAddress();
	}

}

package com.pluralsight.structural.adapter;

public class EmployeeAdapterLdap implements Employee {

	private EmployeeLdap instance;
	
	public EmployeeAdapterLdap(EmployeeLdap instance) {
		this.instance = instance;
	}
	
	public String getId() {
		return instance.getCn();
	}

	public String getFirstName() {
		return instance.getGivenName();
	}

	public String getLastName() {
		return instance.getSurname();
	}

	public String getEmail() {
		return instance.getMail();
	}

	public String toString() {
		return "ID: " + instance.getCn();
	}
	
}

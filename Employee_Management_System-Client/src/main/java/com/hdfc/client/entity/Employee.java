package com.hdfc.client.entity;



import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.persistence.Entity;
import javax.persistence.Id;


public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String dateOfBirth;
	
	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, String dateOfBirth) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String date) {
		this.dateOfBirth = date;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}

	
	
}

package com.hdfc.employeeManagement.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hdfc.employeeManagement.entity.Employee;
import com.hdfc.employeeManagement.exception.employeeException;
import com.hdfc.employeeManagement.repository.IEmployeeRepository;

public class EmployeeImpService implements IEmployeeService {

	@Autowired
	IEmployeeRepository employeeRepository;
	
	@Override
	public Employee getByEmployeeId(int employeeId) throws employeeException {
		
		return employeeRepository.findById(employeeId).orElseThrow(() -> new employeeException());
		
	}

}

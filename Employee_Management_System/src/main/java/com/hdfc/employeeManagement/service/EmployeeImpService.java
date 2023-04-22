package com.hdfc.employeeManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.employeeManagement.entity.Employee;
import com.hdfc.employeeManagement.exception.InvalidEmployeeIdException;

import com.hdfc.employeeManagement.repository.IEmployeeRepository;

@Service
public class EmployeeImpService implements IEmployeeService {
	
	@Autowired
	IEmployeeRepository employeeRepository;
	
	@Override
	public Employee getByEmployeeId(int employeeId) throws InvalidEmployeeIdException {
		
		return employeeRepository.findById(employeeId).orElseThrow(() -> new InvalidEmployeeIdException("Invalid EmployeeID: " + employeeId));
		
	}

	


}

package com.hdfc.employeeManagement.service;

import org.springframework.stereotype.Service;

import com.hdfc.employeeManagement.entity.Employee;
import com.hdfc.employeeManagement.exception.employeeException;

@Service
public interface IEmployeeService {
	
	public Employee getByEmployeeId(int employeeId) throws employeeException;

}

package com.hdfc.employeeManagement.service;

import org.springframework.stereotype.Service;

import com.hdfc.employeeManagement.entity.Employee;
import com.hdfc.employeeManagement.exception.InvalidEmployeeIdException;


@Service
public interface IEmployeeService {
	
	public Employee getByEmployeeId(int employeeId) throws InvalidEmployeeIdException;

}

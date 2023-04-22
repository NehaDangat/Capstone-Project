package com.hdfc.employeeManagement.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.employeeManagement.entity.Employee;
import com.hdfc.employeeManagement.exception.InvalidEmployeeIdException;

import com.hdfc.employeeManagement.service.IEmployeeService;

@RestController
@RequestMapping("/employee/")
public class EmployeeRestController {
	
	@Autowired
	IEmployeeService employeeService;
	
	@GetMapping("getEmployeeByEmployeeId/{employeeId}")
	public Employee getEmployeeById(@PathVariable int employeeId) throws InvalidEmployeeIdException {
		
		return employeeService.getByEmployeeId(employeeId);
	}

}

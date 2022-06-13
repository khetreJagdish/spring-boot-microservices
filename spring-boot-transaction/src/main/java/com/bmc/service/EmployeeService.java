package com.bmc.service;

import com.bmc.model.Employee;

public interface EmployeeService {
	
	void insertEmployee(Employee emp);

	void deleteEmployeeById(String empid);
}

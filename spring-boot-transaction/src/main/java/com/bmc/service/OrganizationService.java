package com.bmc.service;

import com.bmc.model.Employee;
import com.bmc.model.EmployeeHealthInsurance;

public interface OrganizationService {
	
	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

}

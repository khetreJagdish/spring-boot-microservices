package com.bmc.dao;

import com.bmc.model.EmployeeHealthInsurance;

public interface HealthInsuranceDao {
	
	void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance);

	void deleteEmployeeHealthInsuranceById(String empid);
}

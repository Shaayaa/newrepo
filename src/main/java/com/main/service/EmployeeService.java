package com.main.service;

import java.util.List;

import com.main.dto.EmployeeDTO;

public interface EmployeeService {		
	List<EmployeeDTO> FetchAllEmployees();

	void saveEmployee(EmployeeDTO empDTO);

	EmployeeDTO authenticate(String email, String password);

	void deleteEmp(int employeeId);





	
	
}

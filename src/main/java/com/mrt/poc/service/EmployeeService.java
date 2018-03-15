package com.mrt.poc.service;

import java.util.List;

import com.mrt.poc.entities.Employee;

public interface EmployeeService {
	public void createEmployee(Employee e);
	public Employee getEmployee(int id);
	public List<Employee> getEmployess();
}

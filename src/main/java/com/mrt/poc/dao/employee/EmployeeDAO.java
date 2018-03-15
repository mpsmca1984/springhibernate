package com.mrt.poc.dao.employee;

import java.util.List;

import com.mrt.poc.entities.Employee;

public interface EmployeeDAO {
public void createEmployee(Employee e);
public Employee getEmployee(int id);
public List<Employee> getEmployess();
}

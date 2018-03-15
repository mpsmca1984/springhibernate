package com.mrt.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrt.poc.dao.employee.EmployeeDAO;
import com.mrt.poc.entities.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public void createEmployee(Employee e) {
		// TODO Auto-generated method stub
		employeeDAO.createEmployee(e);
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployee(id);
	}

	@Override
	public List<Employee> getEmployess() {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployess();
	}

}

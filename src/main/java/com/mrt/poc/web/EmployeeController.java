package com.mrt.poc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mrt.poc.entities.Employee;
import com.mrt.poc.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/{id}")
	public Employee getEmployee(@PathVariable("id") Integer id) {
		return employeeService.getEmployee(id);
	}
	@RequestMapping("/")
	public List<Employee> getAllEmployee(){
		return employeeService.getEmployess();
	}
	@RequestMapping(path="/",method=RequestMethod.POST)
	public String createEmployee(@RequestBody Employee e) {
		employeeService.createEmployee(e);
		return "success";
	}
}

package com.mrt.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mrt.poc.dao.employee.EmployeeDAO;

@SpringBootApplication
public class MrtHibernateApp implements CommandLineRunner {

	@Autowired
	EmployeeDAO employeeDAO;
	
	public static void main(String[] args) {
		SpringApplication.run(MrtHibernateApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*	Employee e=new Employee();
		e.setName("Mritunjay Prasad Singh");
		e.setSalary(12000.0);
		e.setDoj(new Date());
		employeeDAO.createEmployee(e);*/
	}
}

package com.mrt.poc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MrtHibernateApp implements CommandLineRunner {
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

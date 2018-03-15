package com.mrt.poc.dao.employee;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mrt.poc.entities.Employee;

@Repository("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void createEmployee(Employee e) {
		this.sessionFactory.openSession().save(e);
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return this.sessionFactory.openSession().get(Employee.class,id);
	}

	@Override
	public List<Employee> getEmployess() {
		Criteria criteria=this.sessionFactory.openSession().createCriteria(Employee.class);
		return criteria.list();
	}

}

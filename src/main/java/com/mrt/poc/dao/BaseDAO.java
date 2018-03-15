package com.mrt.poc.dao;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseDAO {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Bean
	public SessionFactory getSessionFacoty() {
		if(entityManagerFactory.unwrap(SessionFactory.class)==null) {
			throw new IllegalStateException("It is not compatibale with hibernate factory");
		}
		return entityManagerFactory.unwrap(SessionFactory.class);
	}
}

package com.mrt.poc.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mrt.poc.entities.Employee;

@RunWith(SpringRunner.class)
@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void getEmployeeTest()throws Exception{
		MvcResult mvcResult=mockMvc.perform(get("/employee/1")
				.accept(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk())
				.andReturn();
			ObjectMapper om=new ObjectMapper();
			Employee employee=om.readValue(mvcResult.getResponse().getContentAsString(),Employee.class);
			assertNotNull(employee);
			assertEquals(employee.getName(),"Mritunjay Singh");
	}
	
	@Test
	public void getEmployeesTest()throws Exception{
		MvcResult mvcResult=mockMvc.perform(get("/employee/")
				.accept(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk())
				.andReturn();
		String mvcstr=mvcResult.toString();
			assertNotNull(mvcstr);
			System.out.println(mvcstr);
	}
}

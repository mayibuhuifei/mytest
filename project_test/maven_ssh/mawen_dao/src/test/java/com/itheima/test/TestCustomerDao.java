package com.itheima.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.dao.CustomerDao;
import com.itheima.domain.Customer;

public class TestCustomerDao {
	@Test
	public void test() {

		ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("classpath:application-dao.xml");
		CustomerDao bean = (CustomerDao) applicationcontext.getBean("customerDao");
		List<Customer> findAll = bean.findAll();
		for (Customer customer : findAll) {
			System.out.println(customer.getCustName());
		}

	}
}

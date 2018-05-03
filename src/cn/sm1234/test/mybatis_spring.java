package cn.sm1234.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sm1234.dao.CustomerMapper;
import cn.sm1234.domain.Customer;

public class mybatis_spring {
	

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerMapper customerMapper = (CustomerMapper) ac.getBean("customerMapper");
		
		Customer customer = new Customer();
		
		customer.setName("no mapper class");
		
		customerMapper.saveCustomer(customer);
	}
}

package cn.sm1234.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sm1234.dao.CustomerMapper;
import cn.sm1234.domain.Customer;
import cn.sm1234.service.UserService;

@Service
public class UserImpl implements UserService{

	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public void saveUser(Customer customer) {
		
		customerMapper.saveCustomer(customer);
		
		
		System.out.println("service save success!");
	}

}

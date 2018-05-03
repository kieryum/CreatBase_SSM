package cn.sm1234.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.sm1234.domain.Customer;
import cn.sm1234.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	/**
	 * 保存用户名字
	 * @param customer
	 * @return String
	 */
	@RequestMapping(method=RequestMethod.POST,value="saveUser")
	public String saveUser(Customer customer) {
		
		userService.saveUser(customer);
		
		System.out.println("controller save success");
		
		return "success";
	}
	
}

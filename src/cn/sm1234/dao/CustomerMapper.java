package cn.sm1234.dao;

import cn.sm1234.domain.Customer;

public interface CustomerMapper {

	/**
	 * 保存customer
	 * @param customer
	 */
	public void saveCustomer(Customer customer);
}

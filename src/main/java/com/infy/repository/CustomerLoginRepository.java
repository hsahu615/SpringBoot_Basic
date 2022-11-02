package com.infy.repository;

import com.infy.dto.CustomerLoginDTO;

public interface CustomerLoginRepository {
	public CustomerLoginDTO getCustomerLoginByUserName(String userName);
}

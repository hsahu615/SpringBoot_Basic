package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;
import com.infy.repository.CustomerLoginRepository;

@Service(value = "customerLoginService")
public class CustomerLoginServiceImpl implements CustomerLoginService {

	@Autowired
	private CustomerLoginRepository customerLoginRepository;
	
	@Override
	public String authenticateCustomer(CustomerLoginDTO customerLogin) throws InfyBankException {
		String toReturn = null;
		CustomerLoginDTO customerLoginFromRepository = customerLoginRepository.getCustomerLoginByUserName(customerLogin.getUsername());
		
		if(customerLogin.getPassword().equals(customerLoginFromRepository.getPassword())) {
			toReturn = "SUCCESS";
		}
		else {
			throw new InfyBankException("Service.WRONG_CREDENTIALS");
		}
		return toReturn;
	}

	

}

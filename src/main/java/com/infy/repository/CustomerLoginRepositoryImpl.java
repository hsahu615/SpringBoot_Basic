package com.infy.repository;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.infy.dto.CustomerLoginDTO;
@Repository(value="customerLoginRepository")
public class CustomerLoginRepositoryImpl implements CustomerLoginRepository {
	

	@Override
	public CustomerLoginDTO getCustomerLoginByUserName(String userName) {
		Map<String, String> customerCredentials = new HashMap<String, String>();
		customerCredentials.put("robin", "robin123");
		customerCredentials.put("harry", "harry123");
		customerCredentials.put("garry", "garry123");
		customerCredentials.put("monica", "monica123");
		CustomerLoginDTO customerLogin = new CustomerLoginDTO();
		customerLogin.setUsername(userName);
		customerLogin.setPassword(customerCredentials.get(userName));
		return customerLogin;
	}
}

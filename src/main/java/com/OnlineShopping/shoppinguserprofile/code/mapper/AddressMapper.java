package com.OnlineShopping.shoppinguserprofile.code.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.OnlineShopping.shoppinguserprofile.code.entity.Address;

@Component
public class AddressMapper {

	public List<Address> fetchAddressEntityList(){
		List<Address> addressList = new ArrayList<>();
		Address addr = new Address();
		
		addr.setAddressId("AD1001");
		addr.setCity("Pune");
		addr.setHouseAddress("ABC Apartments");
		addr.setLandmark("near DEF studio");
		addr.setMobileNumber(9999999999L);
		addr.setName("Mr. Jay Pritchett");
		addr.setPinCode(90101);
		addr.setState("Maharashtra");
		addr.setStreet("Taylor street");
		addressList.add(addr);
		
		return addressList;
	}
	
}

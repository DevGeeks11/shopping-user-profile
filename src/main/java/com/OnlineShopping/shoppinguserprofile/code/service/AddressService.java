package com.OnlineShopping.shoppinguserprofile.code.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineShopping.shoppinguserprofile.code.dto.AddressDTO;
import com.OnlineShopping.shoppinguserprofile.code.entity.Address;
import com.OnlineShopping.shoppinguserprofile.code.mapper.AddressMapper;

@Service
public class AddressService {

	@Autowired
	private AddressMapper addrMapper;
	
	public List<AddressDTO> fetchAllAddress(){
		return mapEntityToDto(addrMapper.fetchAddressEntityList());
	}
	
	private List<AddressDTO> mapEntityToDto(List<Address> addressEntityList){
		List<AddressDTO> dtoList = new ArrayList<>();
		
		addressEntityList.forEach(entityObj -> {
		AddressDTO dtoObj = new AddressDTO();
		dtoObj.setAddressId(entityObj.getAddressId());
		dtoObj.setCity(entityObj.getCity());
		dtoObj.setHouseAddress(entityObj.getHouseAddress());
		dtoObj.setLandmark(entityObj.getLandmark());
		dtoObj.setMobileNumber(entityObj.getMobileNumber());
		dtoObj.setName(entityObj.getName());
		dtoObj.setPinCode(entityObj.getPinCode());
		dtoObj.setState(entityObj.getState());
		dtoObj.setStreet(entityObj.getStreet());
		
		dtoList.add(dtoObj);
		});
		
		return dtoList;
	}
}

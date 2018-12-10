package com.helptree.general.services;

import com.helptree.general.dto.LoginDto;
import com.helptree.general.dto.UserDto;
import com.helptree.general.dto.UserMasterDto;

public interface GeneralService {
	
	public UserDto getUserResponse(LoginDto userDto);

	public UserMasterDto registerUser(UserMasterDto userMaster);

}

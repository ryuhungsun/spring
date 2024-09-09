package com.jusung.app.service;

import com.jusung.app.dto.LogInDTO;
import com.jusung.app.dto.ResultDTO;
import com.jusung.app.dto.UserDTO;

public interface CommService {
	public ResultDTO logIn(LogInDTO logInDto);
	public ResultDTO commCode();
	public ResultDTO signUp(UserDTO userDT);
	public ResultDTO menuList();
	
}

package com.jusung.app.service;

import com.jusung.app.dto.LogInDTO;
import com.jusung.app.dto.ResultDTO;
import com.jusung.app.dto.UserDTO;

public interface UserService {
	public ResultDTO logIn(LogInDTO logInDto);
	public ResultDTO findAll();
	public ResultDTO editById(UserDTO uDto);
	public ResultDTO delete(int no);
	public ResultDTO save(UserDTO uDto);
}

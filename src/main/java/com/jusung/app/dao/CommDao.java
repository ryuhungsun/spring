package com.jusung.app.dao;

import java.util.List;

import com.jusung.app.dto.CommCodeDTO;
import com.jusung.app.dto.EmpDTO;
//import com.jusung.app.dto.UserDTO;
import com.jusung.app.dto.LogInDTO;
import com.jusung.app.dto.MenuDTO;
import com.jusung.app.dto.UserDTO;

public interface CommDao { 

	public UserDTO logIn(LogInDTO logInDTO);
	public List<CommCodeDTO> commCode();
	public int signUp(UserDTO userDTO);
	public List<MenuDTO> menuList();
}
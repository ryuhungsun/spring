package com.jusung.app.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jusung.app.dto.CommCodeDTO;
import com.jusung.app.dto.LogInDTO;
import com.jusung.app.dto.MenuDTO;
import com.jusung.app.dto.UserDTO;

@Mapper 
public interface CommMapper {
	public UserDTO logIn(LogInDTO loginDto);
	public List<CommCodeDTO> commCode();
	public int signUp(UserDTO userDTO);
	public List<MenuDTO> menuList();
}

package com.jusung.app.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jusung.app.dto.CommCodeDTO;
import com.jusung.app.dto.LogInDTO;
import com.jusung.app.dto.MenuDTO;
import com.jusung.app.dto.UserDTO;
import com.jusung.app.mapper.CommMapper;
import com.jusung.app.mapper.UserMapper; 

@Repository
public class CommDaoImpl implements CommDao{

	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	
	@Autowired CommMapper commMapper;

	@Override
	public UserDTO logIn(LogInDTO logInDTO) {
		log.info("commDao login");
		// TODO Auto-generated method stub
		return commMapper.logIn(logInDTO);
	}
	@Override
	public List<CommCodeDTO> commCode() {
		log.info("commDao login");
		// TODO Auto-generated method stub
		return commMapper.commCode();
	}
	@Override
	public int signUp(UserDTO userDTO) { 
		// TODO Auto-generated method stub
		return commMapper.signUp(userDTO);
	}
	@Override
	public List<MenuDTO> menuList() {
		return commMapper.menuList();
	}
	
}

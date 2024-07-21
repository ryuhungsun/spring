package com.jusung.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jusung.app.dto.UserDTO;
import com.jusung.app.mapper.UserMapper; 

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired UserMapper uMapper;

	@Override
	public List<UserDTO> findAll() {
		// TODO Auto-generated method stub
		System.out.println("dao");
		return uMapper.findAll();// uMapper.findAll();
	}

	@Override 
	public int editById(UserDTO uDto) {
		// TODO Auto-generated method stub
		return uMapper.editById(uDto);
	}

	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		return uMapper.delete(no);
	}

	@Override
	public int save(UserDTO uDto) {
		// TODO Auto-generated method stub
		return uMapper.save(uDto);
	}

}

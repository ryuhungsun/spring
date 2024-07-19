package com.jusung.app.dao;

import java.util.List;
import com.jusung.app.dto.UserDTO;

public interface UserDao {

	public List<UserDTO> findAll();
	public int editById(UserDTO uDto);
	public int delete(int no);
	public int save(UserDTO uDto);
}
package com.jusung.app.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jusung.app.dto.LogInDTO;
import com.jusung.app.dto.UserDTO;

@Mapper 
public interface UserMapper {

	@Select("select * from employees where email=#{email} and pwd=#{pwd}")
	public UserDTO logIn(LogInDTO loginDto);
	
	@Select("select * from user")
	public List<UserDTO> findAll();
	
	@Update("update user set name=#{name}, pwd=#{pwd}, gender=#{gender} where no=#{no}")
	public int editById(UserDTO uDto);
	
	@Update("update user set del=true where no=#{no}")
	public int delete(int no);
	
	@Insert("insert into user(name, email, pwd, gender) values(#{name}, #{email}, #{pwd}, #{gender})")
	public int save(UserDTO uDto);
}

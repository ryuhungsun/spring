package com.jusung.app.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jusung.app.dto.EmpDTO;
import com.jusung.app.dto.LogInDTO;
import com.jusung.app.dto.UserDTO;

@Mapper 
public interface EmpMapper { 
	public List<EmpDTO>  empList(EmpDTO loginDto); 
	public EmpDTO  selectEmp(EmpDTO loginDto); 
}

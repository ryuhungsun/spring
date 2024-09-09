package com.jusung.app.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jusung.app.dto.EmpDTO;
import com.jusung.app.dto.LogInDTO;
import com.jusung.app.dto.UserDTO;
import com.jusung.app.mapper.CommMapper;
import com.jusung.app.mapper.EmpMapper;
import com.jusung.app.mapper.UserMapper; 

@Repository
public class EmpDaoImpl implements EmpDao{

	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	
	@Autowired EmpMapper empMapper;

	@Override
	public List<EmpDTO> empList(EmpDTO empDto) { 
		log.info("EmpDaoImpl empList==============");
		// TODO Auto-generated method stub
		return empMapper.empList(empDto);
	}

	@Override
	public EmpDTO selectEmp(EmpDTO empDto) {
		return empMapper.selectEmp(empDto);
	}
	
}

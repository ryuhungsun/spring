package com.jusung.app.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jusung.app.dao.CommDao;
import com.jusung.app.dao.EmpDao;
import com.jusung.app.dao.UserDao;
import com.jusung.app.dto.EmpDTO;
import com.jusung.app.dto.LogInDTO;
import com.jusung.app.dto.ResultDTO;
import com.jusung.app.dto.UserDTO;

@Service
public class EmpServiceImpl implements EmpService{
	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	private ResultDTO rDto;
	
	@Autowired EmpDao empDao;

	@Override
	public ResultDTO empList(EmpDTO empDto) {
		// TODO Auto-generated method stub 
		log.info("info EmpService.empList======================>" +empDto.toString()); // default
		rDto = new ResultDTO();
		List<EmpDTO> resultList = empDao.empList(empDto);
		if(resultList != null) {
			rDto.setState(true);
			rDto.setResult(resultList);
		}else {
			rDto.setState(false);
		}
		return rDto;
	}

	@Override
	public ResultDTO selectEmp(EmpDTO empDto) {
		rDto = new ResultDTO();
		EmpDTO resultList = empDao.selectEmp(empDto);
		if(resultList != null) {
			rDto.setState(true);
			rDto.setResult(resultList);
		}else {
			rDto.setState(false);
		}
		return rDto;
	}

}

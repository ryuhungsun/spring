package com.jusung.app.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jusung.app.dao.CommDao;
import com.jusung.app.dao.UserDao;
import com.jusung.app.dto.MenuDTO;
import com.jusung.app.dto.CommCodeDTO;
import com.jusung.app.dto.LogInDTO;
import com.jusung.app.dto.ResultDTO;
import com.jusung.app.dto.UserDTO;

@Service
public class CommServiceImpl implements CommService{
	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	private ResultDTO rDto;
	
	@Autowired CommDao commDao;

	@Override
	public ResultDTO logIn(LogInDTO loginDto) {
		// TODO Auto-generated method stub 

		log.info("commService" +loginDto.pwd); // default
		rDto = new ResultDTO();
		UserDTO resultList = commDao.logIn(loginDto);
		if(resultList != null) {
			rDto.setState(true);
			rDto.setResult(resultList);
		}else {
			rDto.setState(false);
		}
		return rDto;
	}
	@Override
	public ResultDTO commCode() {
		// TODO Auto-generated method stub 

		log.info("commService.commCode()"); // default
		rDto = new ResultDTO();
		List<CommCodeDTO> resultList = commDao.commCode();
		if(resultList != null) {
			rDto.setState(true);
			rDto.setResult(resultList);
		}else {
			rDto.setState(false);
		}
		return rDto;
	}
	@Override
	public ResultDTO signUp(UserDTO userDTO) {
		
		log.info("commService.commCode()"); // default
		rDto = new ResultDTO();
		try {
			int resultList = commDao.signUp(userDTO);
			if(resultList > 0) {
				rDto.setState(true);
				rDto.setResult(resultList);
				rDto.setMessage("사용자 등록을 성공하였습니다.");
			}else {
				rDto.setState(false);
				rDto.setMessage("사용자 등록을 실패하였습니다.");
			}
		}catch(Exception e) {
			rDto.setState(false);
			rDto.setMessage("사용자 등록을 실패하였습니다.\n데이터를 확인하세요");
		}
		return rDto;
	}
	@Override
	public ResultDTO menuList() {
		// TODO Auto-generated method stub 

		log.info("commService.menuList()"); // default
		rDto = new ResultDTO();
		List<MenuDTO> resultList = commDao.menuList();
		if(resultList != null) {
			rDto.setState(true);
			rDto.setResult(resultList);
		}else {
			rDto.setState(false);
		}
		return rDto;
	}
}

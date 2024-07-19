package com.jusung.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jusung.app.dao.UserDao;
import com.jusung.app.dto.ResultDTO;
import com.jusung.app.dto.UserDTO;

@Service
public class UserServiceImpl implements UserService{

	private ResultDTO rDto;
	
	@Autowired UserDao uDao;
	
	@Override
	public ResultDTO findAll() {
		// TODO Auto-generated method stub
		rDto = new ResultDTO();
		List<UserDTO> resultList = uDao.findAll();
		if(resultList != null) {
			rDto.setState(true);
			rDto.setResult(resultList);
		}else {
			rDto.setState(false);
		}
		return rDto;
	}

	@Override
	public ResultDTO editById(UserDTO uDto) {
		rDto = new ResultDTO();
		int state = uDao.editById(uDto);
		System.out.println("stat : "+state);
		if(state == 1) {
			rDto.setState(true);
			rDto.setMessage("사용자 수정이 성공 하였습니다.");
		}else {
			rDto.setState(false);
			rDto.setMessage("사용자 수정이 실패 하였습니다.");
		}
		return rDto;
	}

	@Override
	public ResultDTO delete(int no) {
		rDto = new ResultDTO();
		int state = uDao.delete(no);
		if(state == 1) {
			rDto.setState(true);
			rDto.setMessage("사용자 삭제가 성공 하였습니다.");
		}else {
			rDto.setState(false);
			rDto.setMessage("사용자 삭제가 실패 하였습니다.");
		}
		return rDto;
	}

	@Override
	public ResultDTO save(UserDTO uDto) {
		rDto = new ResultDTO();

		System.out.println("uDto :"+uDto.name);
		System.out.println("uDto :"+uDto.email);
		System.out.println("uDto :"+uDto.pwd);
		System.out.println("uDto :"+uDto.gender);
		int state = uDao.save(uDto);
		if(state == 1) {
			rDto.setState(true);
			rDto.setMessage("사용자 저장이 성공 하였습니다.");
		}else {
			rDto.setState(false);
			rDto.setMessage("사용자 저장이 실패 하였습니다.");
		}
		return rDto;
	}

}

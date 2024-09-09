package com.jusung.app.service;

import com.jusung.app.dto.EmpDTO;
import com.jusung.app.dto.ResultDTO;

public interface EmpService {
	public ResultDTO empList(EmpDTO empDto); 
	public ResultDTO selectEmp(EmpDTO empDto); 
}

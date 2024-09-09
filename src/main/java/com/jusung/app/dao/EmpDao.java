package com.jusung.app.dao;

import java.util.List;

import com.jusung.app.dto.EmpDTO;

public interface EmpDao {
	public List<EmpDTO> empList(EmpDTO empDto);
	public EmpDTO selectEmp(EmpDTO empDto);
}
package com.jusung.app.dto;
import java.time.LocalDate;

import lombok.Data;

@Data
public class UserDTO {

	public int no;
	public String auth;
	public String auth2;
	public String emp_id;
	public String name;
	public String email;
	public String dept;
	public String dept2;
	public String grade;
	public String grade2;
	public String pwd;
	public Boolean	del;
	public LocalDate regDate;
}
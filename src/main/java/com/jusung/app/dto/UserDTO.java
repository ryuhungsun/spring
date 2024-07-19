package com.jusung.app.dto;
import java.time.LocalDate;

import lombok.Data;

@Data
public class UserDTO {

	public int no;
	public String name;
	public String email;
	public String pwd;
	public Boolean gender;
	public Boolean	del;
	public LocalDate regDate;
}
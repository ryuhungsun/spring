package com.jusung.app.dto;
import java.time.LocalDate;

import lombok.Data;

@Data
public class LogInDTO {

	public int no;
	public String name;
	public String email;
	public String pwd;
	public String gender; 
	public Boolean	del;
	//public LocalDate regDate;
}
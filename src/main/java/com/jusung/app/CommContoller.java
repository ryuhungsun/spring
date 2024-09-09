package com.jusung.app;

import org.springframework.web.bind.annotation.RestController;

import com.jusung.app.dto.LogInDTO;
import com.jusung.app.dto.ResultDTO;
import com.jusung.app.dto.UserDTO;
import com.jusung.app.service.CommService;
import com.jusung.app.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;                              

@RestController 
@CrossOrigin(origins = "http://localhost:3000") 
//@CrossOrigin(origins = "https://jusung.netlify.app")
public class CommContoller { 
	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	
	@Autowired CommService commService;
	
	@GetMapping("/")
	public String home() {
		log.trace("trace message");
		log.debug("debug message");
		log.info("info message"); // default		
		log.warn("warn message");
		log.error("error message");
		return "Data 준비중.....";
	}
	
	@PostMapping("/logIn")
	public ResultDTO login(@RequestBody LogInDTO logInDTO) {
		log.debug("login"); 
		log.info("info common.message11" +logInDTO.email); // default
		log.info("info common.message11" +logInDTO.pwd); // default
		return commService.logIn(logInDTO);
	}
	
	@PostMapping("/commCode")
	public ResultDTO commCode() {
		log.debug("commCod"); 
		return commService.commCode();
	}
	
	@PostMapping("/signUp")
	public ResultDTO signUp(@RequestBody UserDTO userDTO) {
		log.info("signUp :  "); 
		log.info("signUp :  "+ userDTO.toString()); 
		return commService.signUp(userDTO);
	}
	
	@PostMapping("/menuList")
	public ResultDTO menuList() {
		return commService.menuList();
	}
	
}

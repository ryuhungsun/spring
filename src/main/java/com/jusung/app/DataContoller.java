package com.jusung.app;

import org.springframework.web.bind.annotation.RestController;

import com.jusung.app.dto.ResultDTO;
import com.jusung.app.dto.UserDTO;
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
import org.springframework.web.bind.annotation.RequestParam;                              

@RestController 
//@CrossOrigin(origins = "http://localhost:3000") 
@CrossOrigin(origins = "https://jusung.netlify.app")
public class DataContoller {
	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	@GetMapping("/")
	public String home() {
		log.trace("trace message");
		log.debug("debug message");
		log.info("info message"); // default		
		log.warn("warn message");
		log.error("error message");
		return "Data 준비중.....";
	}
	
	@GetMapping("/api")
	public String api() {
		return "API Data 준비중.....";
	}
	
	@Autowired UserService uService;
	
	@PostMapping("/findAll")
	public ResultDTO findAll() {
		log.trace("trace message");
		log.debug("debug message");
		log.info("info message"); // default
		log.warn("warn message");
		log.error("error message");
		System.out.println("controll");
		return uService.findAll();
	}
	
	@PostMapping("/editById")
	public ResultDTO editById(@RequestBody UserDTO uDto) {
		return uService.editById(uDto);	
	}
	
	@DeleteMapping("/delete")
	public ResultDTO delete(@RequestParam("no") int no ) {
		System.out.println("uDto :"+no);
		return uService.delete(no);
	}
	
	@PutMapping("/save")
	public ResultDTO save(@RequestBody UserDTO uDto) {
		System.out.println("uDto :"+uDto.email);
		return uService.save(uDto);
	}
}

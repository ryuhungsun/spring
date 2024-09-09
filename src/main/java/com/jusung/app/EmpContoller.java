package com.jusung.app;

import org.springframework.web.bind.annotation.RestController;

import com.jusung.app.dto.EmpDTO;
import com.jusung.app.dto.LogInDTO;
import com.jusung.app.dto.ResultDTO;
import com.jusung.app.dto.UserDTO;
import com.jusung.app.service.CommService;
import com.jusung.app.service.EmpService;
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
public class EmpContoller {
	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	
	@Autowired EmpService empService;
	
	@PostMapping("/emp/empList")
	public ResultDTO empList(@RequestBody EmpDTO empDTO) {
		log.debug("empList"); 
		log.info("info EmpDTO.dept======================>" +empDTO.dept); // default
		log.info("info EmpDTO.grade======================>" +empDTO.grade); // default
		log.info("info EmpDTO.name======================>" +empDTO.name); // default
		return empService.empList(empDTO);
	}
	
	@PostMapping("/emp/selectEmp")
	public ResultDTO selectEmp(@RequestBody EmpDTO empDTO) {
		log.debug("empList"); 
		log.info("info EmpDTO.empid======================>" +empDTO.empid); // default
		log.info("info EmpDTO.grade======================>" +empDTO.grade); // default
		log.info("info EmpDTO.name======================>" +empDTO.name); // default
		return empService.selectEmp(empDTO);
	}
	
}

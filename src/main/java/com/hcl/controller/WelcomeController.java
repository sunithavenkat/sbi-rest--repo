package com.hcl.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rock")
public class WelcomeController {
  
	
	public String Welcome() {
		String msg="Heartly welcome to Restful webservice";
		return msg;
	}
	@GetMapping("/WelcomeNew")
	public ResponseEntity<String> welcome(){
		String msg="WELCOME TO RESTFUL WEBSERVICE";
		return new ResponseEntity(msg,HttpStatus.OK);
	}
}

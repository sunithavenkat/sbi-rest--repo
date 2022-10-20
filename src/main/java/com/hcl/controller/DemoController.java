package com.hcl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veeru")
public class DemoController {
    
	public DemoController() {
		System.out.println("getting first controller");
	}
	@GetMapping("/veeru")
	public String DemoController() {
		return "Restful webservice";
	}
}

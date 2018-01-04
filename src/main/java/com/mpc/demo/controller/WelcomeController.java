package com.mpc.demo.controller;


import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mpc.demo.entity.Student;
import com.mpc.demo.repo.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class WelcomeController {
	
	@Autowired
	StudentRepository sRepository;
	
	private static final Logger logger = LoggerFactory
			.getLogger(WelcomeController.class);

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		sRepository.save(new Student("101","Chabed","17258992"));
		logger.info("request for welcome page");
		model.put("message", this.message);
		return "welcome";
	}
	
	@RequestMapping("about")
	public String aboutPage(Map<String, Object> model) {
		return "about";
	}
	
	
}
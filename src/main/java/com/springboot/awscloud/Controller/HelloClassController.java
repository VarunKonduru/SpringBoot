package com.springboot.awscloud.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloClassController {
	
	@RequestMapping("/")
	public String HelloIndex(){
		return "index";
	}
}

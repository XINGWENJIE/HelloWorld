package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo2 {
	
	
	@ResponseBody
	@RequestMapping("helloWorld")
	public String helloWorld(){
		return "hello";
	}
}

package com.piano.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TestController {
	Logger log = LoggerFactory.getLogger(TestController.class);
	@RequestMapping("/test")
	public String test(){
		log.info("测试成功");
		return "front/search";
	}
	@RequestMapping("/index")
	public String test1(){
		log.info("测试成功");
		return "login";
	}
}

package com.piano.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("haha")
public class KK {
	@RequestMapping("hyan")
	public void hh(String usermane){
		System.out.println("测试");
	}
}

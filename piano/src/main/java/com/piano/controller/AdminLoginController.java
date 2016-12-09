package com.piano.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.piano.exception.PianoException;

/*@Controller
@RequestMapping("/admin")
public class AdminLoginController {
	Logger log = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("/confirmAdmin")
	@ResponseBody
	public String login(@PathVariable String admin, @PathVariable String pswd) throws PianoException{
		try{
			log.info(admin+"   "+pswd);
		}catch(Exception e){
			throw new PianoException("用户登录失败");
		}
		return "index";
	}
}
*/
package com.piano.controller.base;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

public class ActiveController extends BaseController{
	protected  ModelAndView createView(String path,ModelMap modelMap){
		String tempPath = "active/"+path;
		System.out.println(tempPath);
		return super.createView(tempPath,modelMap);
	}
}

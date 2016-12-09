package com.piano.controller.base;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

public class UsersController extends BaseController{
	private final static String path = "users/";
	private final static String tpl = "tpl/";
	
	@Override
	protected ModelAndView createView(String path,ModelMap modelMap){
		return super.createView(UsersController.path+path, modelMap);
	}
	protected ModelAndView createTlpView(String path,ModelMap modelMap){
		return this.createView(UsersController.tpl+path, modelMap);
	}
}

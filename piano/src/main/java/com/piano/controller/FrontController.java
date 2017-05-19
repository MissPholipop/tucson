package com.piano.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.piano.controller.base.BaseController;
import com.piano.dto.SearchDto;
import com.piano.entity.Admin;
import com.piano.service.AdminService;
import com.piano.service.serviceIml.IndexManager;

@Controller

public class FrontController extends BaseController{
	Logger log = LoggerFactory.getLogger(FrontController.class);
	
	@Resource
	private AdminService adminSer ;
	
	/*@RequestMapping(value="user_name_confirm", method=RequestMethod.GET)
	@ResponseBody
	public String  confirm(String username,HttpServletRequest request,  
            HttpServletResponse response) throws IOException, PianoException {
		 	Admin admin = new Admin();
		 	
		
		 		try {
		 			//log.info(username);
		 			admin.setAdminName(username);
					//adminSer.login(admin);
					 PrintWriter out = null; 
					 out = response.getWriter();
					 response.setContentType("application/json");
					 out.write(1);
					return "注册失败";
					 
				} catch (PianoException e) {
					log.error(e+"");
					throw e;
				}
		 	
	}*/
	
	@RequestMapping(value= "confirm",method = RequestMethod.POST)
	public String confirm(Admin admin){
		log.info(admin.getAdminName()+","+admin.getAdminPswd());
		return "admin/user_index";
	}
	@RequestMapping("login.html")	
	public ModelAndView login(Admin admin,ModelMap modelMap){
		
/*		log.info("可以在这里写其他的内容");
		
		log.info("用户名:"+admin.getAdminName()+"密码："+admin.getAdminPswd());*/
		
		try{
			Admin u = ((ArrayList<Admin>)adminSer.select(admin).getRtn().get("data")).get(0);
			log.info(u+"");
			if(u != null){//登录成功
				this.request.getSession().setAttribute("admin", u);
				return createView("front/index", modelMap);
				//return this.createRedirectView("test",modelMap);
			}}catch (Exception e) {
				log.error("登录失败:"+e);
			}
			modelMap.addAttribute("msg","用户名或者密码错误!");
		
		return createView("index1", modelMap);
	}
	@RequestMapping("search")
	public void search(String keyWord){
		//IndexManager index = new IndexManager();
		log.info("这是key"+keyWord);
		if(keyWord != null){
			List<SearchDto> list= IndexManager.searchIndex(keyWord);
			this.out(list);
		}
		
		//return null;
	}
}

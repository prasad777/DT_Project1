package com.jp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



//@WebServlet("/HelloController")

@Controller
public class HelloController  {
       
   


	@RequestMapping("/")
	protected ModelAndView helloWorld() {
		// TODO Auto-generated method stub
		ModelAndView  modelandview=new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage","hi user, welcome to first spring mvc first applications");
		return modelandview;
	}



	
}

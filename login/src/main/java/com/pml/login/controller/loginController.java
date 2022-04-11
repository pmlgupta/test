package com.pml.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pml.login.service.display;

@Controller
public class loginController {
	
	@Autowired
    display disp;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginMessage()
	{
				return "HELLO";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginMessage(@RequestParam String name, ModelMap model)
	{
		model.put("name",name);
		return "welcome";
	}
}

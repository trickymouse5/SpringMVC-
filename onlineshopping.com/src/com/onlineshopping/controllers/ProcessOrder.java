package com.onlineshopping.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProcessOrder 
{
	@RequestMapping("/takeorder")
	public String processOrder(Model model, HttpServletRequest req)
	{
		String userOrderInput= req.getParameter("orderthis");
		model.addAttribute("userInput", userOrderInput);
		return "takeorder";
	}
}

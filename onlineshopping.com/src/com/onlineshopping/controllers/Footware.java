package com.onlineshopping.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Footware 
{
	@RequestMapping("/footware")
	public String showFootwares()
	{
		return "show-fotware";
	}
}

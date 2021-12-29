package com.onlineshopping.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Clothes 
{
	@RequestMapping("/clothes")
	public String showClothes()
	{
		return "show-clothes";
	}
}

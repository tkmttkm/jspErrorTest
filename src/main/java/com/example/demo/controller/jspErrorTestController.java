package com.example.demo.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jspErrorTestController {

	@Autowired
	private MessageSource msgsrc;
	
	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("title", msgsrc.getMessage("title.index", null, Locale.JAPAN));
		return "/jspErrorTest";
	}
	
}

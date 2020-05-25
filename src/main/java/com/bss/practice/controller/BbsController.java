package com.bss.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bbs/*")
public class BbsController {
	
	@RequestMapping("bbsMain")
	public String bbs() {
		
		return "bbs/bbsMain";
	}
}

package com.ktdsuniv.lecture.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String IndexPage() {
		return "index";
	}
}

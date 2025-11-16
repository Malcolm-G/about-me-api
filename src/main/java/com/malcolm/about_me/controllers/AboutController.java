package com.malcolm.about_me.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {

	/**
	 * This forwards all request to the React app. Using requestMapping instead of
	 * specific post or get for the purpose of being method agnostic
	 */
	@RequestMapping(value = { "/about", "/" })
	public String forward() {
		return "forward:/index.html";
	}
}

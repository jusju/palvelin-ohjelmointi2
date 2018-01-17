package com.example.HeiMaailma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HeiController {
	@RequestMapping("/hello")
	public String hei(@RequestParam(place = "location") String location, @RequestParam(name = "name") String name) {
		return "Welcome to the " + location + " " + name;
	}
}

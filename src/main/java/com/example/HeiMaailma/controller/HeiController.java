package com.example.HeiMaailma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HeiController {
@RequestMapping("*")
public String hei(){
	return "Hei Maailma";
}
}

package com.example.Tymeleaf.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Tymeleaf.domain.Friend;
import com.example.Tymeleaf.domain.Student;



	@Controller
	public class HelloController {
	@RequestMapping("/bello")
	public String hello(@RequestParam(value="name") String name, @RequestParam(value="age") String age, Model model) {
		model.addAttribute("age", age); 
		model.addAttribute("name", name);
		return "hello";
		
		//localhost:8080/bello?=name=felix&age=22 
	}
	
	@RequestMapping("/hello")
	public String students (Model model) {
		
		//tänne lista stundenteista!
		ArrayList<Student> studentlist = new ArrayList<Student>();
		studentlist.add(new Student("Felix", "Hallenberg", "felix@felix.fi"));
		studentlist.add(new Student("Mikko", "Mallikas", "mikko@mikko.fi"));
		studentlist.add(new Student("Essi", "Esimerkki", "essi@essi.fi"));
		model.addAttribute("studentlist", studentlist);
		return "students";
	}
	
	@RequestMapping(value="/index", method=RequestMethod.POST)
	public String uusFriend (@ModelAttribute Friend friend, Model model){
		// tänne uus friendin lisäys!
		ArrayList<Friend> friendlist = new ArrayList<Friend>();
		model.addAttribute("friendlist", friendlist);
		friendlist.add(friend);
		System.out.println(friend.toString());
		System.out.println(friendlist);
		return "friends";
		
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String friendsForm (Model model) {
		
		model.addAttribute("friend", new Friend());
		
		
		//tänne lista frendeistä
		
		
		return "friends";	
	}
	
	
	}
	
	
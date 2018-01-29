package com.example.Tymeleaf.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Tymeleaf.domaini.Friend;
import com.example.Tymeleaf.domaini.Student;



	@Controller
	public class HelloController {
	
		ArrayList<Friend> friendlist = new ArrayList<Friend>();
		
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
	public String friendSubmit (@ModelAttribute Friend friend, Model model){
		
		//lisätään Friend-olio listaan "friendlist"
		model.addAttribute("friend", friend);
		friendlist.add(friend);
		System.out.println(friendlist.toString());
		model.addAttribute("friendlist", friendlist);
		return "friends";
		
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String friendsForm (Model model) {
		
		//luodaan uusi Friend-olio
		model.addAttribute("friend", new Friend());
		
		return "friends";	
	}
	

	
	}
	
	
package com.example.Tymeleaf.domaini;

import javax.validation.constraints.Size;

public class Friend {
	
	@Size(min=2, max=12)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Friend(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Nimi=" + name;
	}
	
	
}

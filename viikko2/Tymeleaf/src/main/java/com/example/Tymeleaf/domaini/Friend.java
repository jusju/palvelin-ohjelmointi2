package com.example.Tymeleaf.domaini;

public class Friend {
	
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

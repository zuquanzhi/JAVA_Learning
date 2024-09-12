package com.itranswarp.world;

public class Person {

	String name;

	public Person(String name) {
		this.name = name;
	}

	public String hello() {
		return "Hello, " + this.name;
	}
}

package com.cqb.reflect;

import sun.applet.Main;

public class Person {
	private String name;
	public int age;
   int high;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public void show() {
		System.out.println("我是一个人");
	}

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person(int age) {
		super();
		this.age = age;
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public void person(String nation) {
		System.out.println("我的国籍是 ： " + nation);
	}

}

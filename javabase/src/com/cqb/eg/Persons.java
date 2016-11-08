package com.cqb.eg;

class Persons {
	public Persons() {  
         
	    }

	public Persons(String name){  
	        this.name=name;  
	    }

	public Persons(int age){  
	        this.age=age;  
	    }

	public Persons(String name, int age) {  
	        this.age=age;  
	        this.name=name;  
	    }

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
		return "[" + this.name + "  " + this.age + "]";
	}

	private String name;
	private int age;
}

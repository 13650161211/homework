package com.P4;

public class Person {

	private String name;
	private int age;
	private String gerder;
	private String partner;
	public Person() {
		super();
	}
	public Person(String name, int age, String gerder, String partner) {
		super();
		this.name = name;
		this.age = age;
		this.gerder = gerder;
		this.partner = partner;
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
	public String getGerder() {
		return gerder;
	}
	public void setGerder(String gerder) {
		this.gerder = gerder;
	}
	public String getPartner() {
		return partner;
	}
	public void setPartner(String partner) {
		this.partner = partner;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gerder=" + gerder + ", partner=" + partner + "]";
	}
	public boolean marry(Person p) {
		if(gerder.equals(p.gerder) || null!=partner || null!=p.partner) {
			return false;
		}
		if(gerder.equals("男")) {
			if(age<23) {
				return false;
			}
		}else {
			if(age<21) {
				return false;
			}
		}
		if(p.gerder.equals("男")) {
			if(p.age<23) {
				return false;
			}
		}else {
			if(p.age<21) {
				return false;
			}
		}
		partner=p.name;
		p.partner=name;
		return true;
	}
	
}

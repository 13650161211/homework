package com.title37;

public class Test {

	String name;
	private String address;
	protected int age;
	public String desc;
	
	public Test() {
		super();
	}

	public Test(String name, String address, int age, String desc) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.desc = desc;
	}

	void sayName() {
		System.out.println("name is : "+ name);
	}
	
	private void sayAddress() { 
		System.out.println("address id :" + address);
	}
	
	protected void sayAge() {
		System.out.println("age is : "+ age);
	}
	
	public void sayDesc() {
		System.out.println("desc is : "+ desc);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	

	
	
	
}

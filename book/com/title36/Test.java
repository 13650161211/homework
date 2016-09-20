package com.title36;

public class Test {

	private String name;
	private String address;
	private int age;
	
	public Test() {
		super();
		System.out.println("空构造器运行了！！！");
	}
	public Test(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		System.out.println("name，address,age构造器运行了！！！");
	}
	
	public Test(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		System.out.println("name，address构造器运行了！！！");
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
	
	
	
}

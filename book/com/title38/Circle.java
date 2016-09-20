package com.title38;

public class Circle {

	private int size;
	private String desc;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Circle(int size, String desc) {
		super();
		this.size = size;
		this.desc = desc;
	}
	public Circle() {
		super();
	}
	
	public void fly() {
		System.out.println("我会飞");
	}
	
	
}

package com.P4;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("小明", 23, "男", null);
		Person person2 = new Person("小红", 22, "女", null);	
		boolean bool = person1.marry(person2);
		System.out.println(bool);
		System.out.println("person1: "+person1);
		System.out.println("person2: "+person2);
	}
	
}

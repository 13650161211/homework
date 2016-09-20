package com.title37;

public class Main {

	public static void main(String[] args) {
		Test test = new Test("小冯", "广州", 19, "哈哈");
		String name = test.name;
		int age = test.age;
		String address = test.address;
		String desc= test.desc;
		test.sayName();
		test.sayAge();
		test.sayAddress();
		test.sayDesc();
	}

}

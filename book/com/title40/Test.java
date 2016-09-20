package com.title40;

public class Test extends Son implements Person, Animal {

	@Override
	public void eat() {
		System.out.println("吃饭！");
	}

	@Override
	public void sleep() {
		System.out.println("睡觉！");
	}

	@Override
	public void fly() {
		System.out.println("我会飞！");
	}

	@Override
	public void say() {
		System.out.println("说话！");
	}

}

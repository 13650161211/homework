package com.P8;

public class Vehicle {

	private double speed;
	private double size;
	public Vehicle() {
		super();
	}
	public Vehicle(double speed, double size) {
		super();
		this.speed = speed;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + ", size=" + size + "]";
	}
	public void move(){
		System.out.println("移动中~~");
	}
	public void setSpeed(double speed) {
		this.speed = speed;
		System.out.println("****改变速度****");
	}

	public void speedUp() {
		System.out.println("加速！");
		speed+=1;
	}
	public void speedDown() {
		System.out.println("减速！");
		speed-=1;
	}
	
}

package com.P3;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rectanle = new Rectangle(8,6);
		System.out.println("面积是： "+rectanle.getArea());
		System.out.println("周长是： "+rectanle.getPerimeter());
		System.out.println("图案： ");
		System.out.println(rectanle.Draw());
	}

}

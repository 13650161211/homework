package com.P3;

public class Rectangle {

	private double width;
	private double hight;
	public Rectangle() {
		super();
	}
	public Rectangle(double width, double hight) {
		super();
		this.width = width;
		this.hight = hight;
	}
	
	public double getArea() {
		return width*hight;
	}
	
	public double getPerimeter() {
		return 2*(width+hight);
	}
	
	public StringBuffer Draw() {
		StringBuffer s = new StringBuffer();
		for(int j=0;j<hight;j++) {
			if(j==0||j==hight-1) {
				for(int i=0;i<width;i++) {
					s.append(" *");
				}
			}else {
				for(int i=0;i<width;i++) {
					if(i==0||i==width-1) {
						s.append(" *");
					}else {
						s.append("  ");
					}
				}
			}
			s.append("\r\n");
		}
		return s;
	}
}

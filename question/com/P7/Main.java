package com.P7;

public class Main {

	public static void main(String[] args) {
		Postgraduate p = new Postgraduate();
		Undergraduate u = new Undergraduate();
		Student[] students = new Student[]{p,u};
		p.CalculateLevel();
		u.CalculateLevel();
	}

}

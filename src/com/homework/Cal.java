package com.homework;

import java.util.Scanner;

public class Cal {
	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("u1:");
			double u1 = sc.nextDouble();
			System.out.println("u2:");
			double u2 = sc.nextDouble();
			double H = 50.0/60/2.5*u1;
			double B = 20.0*10/150/80*u2;
			System.out.println(u1+" H:"+H);
			System.out.println(u2+" B:"+B); 
			System.out.println("u:"+B/H*100);
			
		}
	}
}

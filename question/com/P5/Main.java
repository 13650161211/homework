package com.P5;

public class Main {

	public static void main(String[] args) {
		Stock stock = new Stock("Java", "Mircro", 4.5, 4.35);
		System.out.println("百分比为： " + stock.getChangePercent() );
		
	}

}

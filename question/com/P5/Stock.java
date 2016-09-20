package com.P5;

public class Stock {

	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	public Stock() {
		super();
	}
	public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
		super();
		this.symbol = symbol;
		this.name = name;
		this.previousClosingPrice = previousClosingPrice;
		this.currentPrice = currentPrice;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public double getChangePercent() {
		return (currentPrice-previousClosingPrice)/previousClosingPrice;
	}
}

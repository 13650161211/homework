package com.P6;

public class Book {

	private String bookName;
	private String author;
	private int sales;
	public Book() {
		super();
	}
	public Book(String bookName, String author, int sales) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.sales = sales;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	
	public boolean setBook(String bookName, String author, int sales) {
		this.bookName = bookName;
		this.author = author;
		this.sales = sales;
		return true;
	}
	
	public void printBook() {
		System.out.println("书名："+bookName+"   作者："+author+"   月销售量："+sales);
	}
}

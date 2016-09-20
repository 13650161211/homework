package com.P2;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;


public class Employee {

	private String name;
	private double salary;
	private Date hireDay;
	private Employee[] employees;
	
	public Employee() {
		super();
	}

	public Employee(String name, double salary, int year, int month, int dayOfMonth) {
		super();
		this.name = name;
		this.salary = salary;
		GregorianCalendar gc = new GregorianCalendar(year,month-1,dayOfMonth);
		this.hireDay = gc.getTime();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void setHireDay(Date hireDay) {
		this.hireDay = hireDay;
	}
	
	public boolean raiseSalary(double incre) {
		boolean bool = true;
		salary = salary * (1+incre);
		return bool;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", hireDay=" + hireDay + ", employees="
				+ Arrays.toString(employees) + "]";
	}

	public void add() {
		Employee em1 = new Employee("小米1", 1200, 2013, 5, 13);
		Employee em2 = new Employee("小米2", 1500, 2014, 6, 15);
		Employee em3 = new Employee("小米3", 1800, 2015, 8, 22);
		employees= new Employee[]{em1,em2,em3};
		for(Employee e : employees) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.add();
		Employee em1 = new Employee("小m", 1500, 2011, 11, 03);
		em1.raiseSalary(0.2);
		System.out.println(em1.salary);
	}
	
}

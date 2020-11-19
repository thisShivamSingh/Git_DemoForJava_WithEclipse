package com.lti.demo;

public class Person {

	private String personName;
	private int personAge;
	private double salary;
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Person(String personName, int personAge, double salary) {
		super();
		this.personName = personName;
		this.personAge = personAge;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAge=" + personAge + ", salary=" + salary + "]";
	}
	
}

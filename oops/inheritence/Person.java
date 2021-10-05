package oops.inheritence;

public class Person {
	public Person(String name) {
		this.name = name;
		System.out.println("inside person constructor");
	}
	protected String name;
	public void walk() {
		System.out.println(name+" is walking");
	}
	public void eat() {
		
		System.out.println("person "+name+" is eating");
	}
}

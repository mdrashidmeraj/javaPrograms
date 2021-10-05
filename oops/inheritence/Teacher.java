package oops.inheritence;

public class Teacher extends Person {
	public Teacher(String name) {
		super(name);
		System.out.println("Insitde teachr constructor");
	}
	public void teach() {
		System.out.println(name+" is teaching");
	}
	public void eat() {											//Method overriding
		super.eat();											//call eat of person class
		System.out.println("teacher"+name+" is eating");
	}
}

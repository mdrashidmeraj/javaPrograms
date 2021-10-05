package oops.inheritence;

public class Singer extends Person {
	public Singer(String name) {
		super(name);
	}
	public void sing() {
		System.out.println(name+" is singing");
	}
	public void eat() {                                          //Method overriding
		System.out.println("singer"+name+" is eating");
	}
}

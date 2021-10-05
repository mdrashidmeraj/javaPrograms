package oops;
class cat{
	int eyes,legs;
	boolean fur;
	String name;
	public void walk() {
		System.out.println("cat is walking");
	}
	public void eat() {
		System.out.println("cat is eating");
	}
	public void description() {
		System.out.println("cat has"+legs+" legs "+eyes+" eyes");
	}
}

public class MainClass {

	public static void main(String[] args) {
		cat c1 = new cat();
		cat c2 = new cat();
		c1.eyes =2;
		c1.legs = 4;
		c2.eyes =2;
		c2.legs =3;
		c1.description();
		c2.description();
		c1.walk();
	}

}

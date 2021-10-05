package oops.interfaces;

public class Person implements Student,Youtuber {

	public static void main(String[] args) {
		Person p = new Person();
		p.study();
		p.makevideo();

	}

	@Override
	public void study() {
		System.out.println("person is studying");
		
	}

	@Override
	public void makevideo() {
	
		System.out.println("person is making video");
	}

}

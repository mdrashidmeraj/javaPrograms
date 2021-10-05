package oops.packages.models;

public class Student {
	private String name;
	public Student(String name) {
		this.name=name;
	}
	public String getname(){
		return name;
	}
	String getpass(){             //default access modifier
		return "aaa";
	}
}

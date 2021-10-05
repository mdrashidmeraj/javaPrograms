package oops.packages;

import oops.packages.models.*;


public class Mainclass {

	public static void main(String[] args) {
		Student obj1 = new Student("tom");
		Teache obj2= new Teache();
//		obj1.name = "jerry";   //can't access as name is private
//		obj1.getpass();			//can't access as getpass() is default and not available in other package
	}

}

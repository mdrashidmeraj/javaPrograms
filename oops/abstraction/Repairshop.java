package oops.abstraction;

public class Repairshop {
	
	public static void repaircar(Car car) {
		System.out.println("car is pepairing");
	}
	
	public static void main(String[] args) {
		Wagonr w = new Wagonr();
		Audi a = new Audi();
		repaircar(a);
		repaircar(w);

	}

}

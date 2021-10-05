package oops;
class vehicles{
	int wheels;
	int headlights;
	String color;
	vehicles(int wheels){
		this.wheels = wheels;
		headlights =2;
		color = "white";
	}
	vehicles(int wheels,String color){
		this.wheels = wheels;
		this.color = color;
		headlights = 2;
	}
}

public class MyConstructor {

	public static void main(String[] args) {
		vehicles car = new vehicles(4);
		vehicles scooty = new vehicles(2,"red");
		System.out.println("car: "+car.wheels+" " +car.color+" "+car.headlights);
		System.out.println("scooty: "+scooty.wheels+" " +scooty.color+" "+scooty.headlights);
	}

}

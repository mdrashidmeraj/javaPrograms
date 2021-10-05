package encapsulations;

public class EncapsulationIntroduction {

	public static void main(String[] args) {
		Student obj = new Student();
	//	obj.name="tom";
	//	obj.age=16;
		obj.setAge(16);
		System.out.println(obj.getAge());
	}

}

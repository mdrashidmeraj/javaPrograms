package comparableandcomparator;
import java.util.*;
public class MainCLass {

	public static void main(String[] args) {
		List<Students> s = new ArrayList<>();
		s.add(new Students(23,"Ram"));
		s.add(new Students(35,"Shyam"));
		s.add(new Students(83,"Aman"));
		s.add(new Students(13,"Anuj"));
		s.add(new Students(65,"Anuj"));
		//Collections.sort(s);  //sort with comparable in student class
		//Collections.sort(s, new sortbynamethenmarks());
		Collections.sort(s, new Comparator<Students>() {
			@Override
			public int compare(Students o1, Students o2) {
				if(o1.name.contentEquals(o2.name))
					return o1.marks-o2.marks;
				else return o1.name.compareTo(o2.name); 
			}

		});
		
		s.forEach(System.out::println);
	}
		
}
//class sortbynamethenmarks implements Comparator<Students>{
//
//	@Override
//	public int compare(Students o1, Students o2) {
//		if(o1.name.contentEquals(o2.name))
//			return o1.marks-o2.marks;
//		else return o1.name.compareTo(o2.name); 
//	}
//}


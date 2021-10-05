package lists;
import java.util.*;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
//		List<String> veg = new ArrayList();
		ArrayList<String> remove = new ArrayList<>();
		remove.add("mango");
		remove.add("papaya");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("grapes");
		fruits.add("papaya");
//		veg.add("patato");
//		veg.add("tamato");
//		fruits.addAll(veg);        //  Fruits mein veg collection dall dega
		System.out.println(fruits);
//		Pair<String,Integer> p1 = new Pair("rashid", 463);
//		Pair<Boolean,String> p2 = new Pair(true,"say");
//		p1.getDescription();
//		p2.getDescription();
		System.out.println(fruits.get(0));           /// give fruits at index 0  (banana);
		fruits.set(1, "orange");                    //replace apple with orange
		System.out.println(fruits);
		fruits.remove(1);
		System.out.println(fruits);
	//	fruits.clear();                                //empty full arraylist
		fruits.removeAll(remove);						//remove collection named remove
		
		System.out.println(fruits.size());			//return size of arraylist
		System.out.println(fruits.contains("papaya")); //tells if papya is present
		
		
		String temp[] = new String[fruits.size()];
		fruits.toArray(temp);
		for(String e:temp) {
			System.out.println(e);
		}
	
	}

}

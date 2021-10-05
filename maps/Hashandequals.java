package maps;

import java.util.HashSet;
import java.util.Set;

class pen{
	int price;
	String color;
	public pen(int price, String color) {
		this.price = price;
		this.color = color;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		pen other = (pen) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + price;
		return result;
	}
	 
}

public class Hashandequals {
	public static void main(String[] args) {
		pen p1 = new pen(10,"blue");
		pen p2 = new pen(10,"blue");
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1);
		System.out.println(p2);
		Set<pen> pens = new HashSet<>();
		pens.add(p1);
		pens.add(p2);
		System.out.println(pens);
	}
}

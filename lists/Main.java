package lists;

public class Main {

	public static void main(String[] args) {
		MyLinkedList<Integer> ll = new MyLinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.display();
		System.out.println(ll.removeLast());
		ll.display();

	}

}

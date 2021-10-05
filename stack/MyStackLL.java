package stack;

import lists.MyLinkedList;

public class MyStackLL<E> {
	private MyLinkedList<E> ll = new MyLinkedList<E>();
	public void push(E e) {
		ll.add(e);
	}
	public E pop() {
			return ll.removeLast();
	}
	public E peek() {
		return ll.seekLast();
	}
	public void display() {
		ll.display();
	}
}

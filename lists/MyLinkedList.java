package lists;

public class MyLinkedList<E> {
	Node<E> head;
	public void add (E data) {
		Node<E> toAdd = new Node<>(data);
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		Node<E> temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	public void display() {
		Node<E> temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public E removeLast() {
		if(isEmpty()) return null;
		Node<E> temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		E removeddata = temp.data;
		temp = null;
		return removeddata;
	}
	public E seekLast() {
		if(isEmpty()) return null;
		Node<E> temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		return temp.data;
	}
	boolean isEmpty(){
		return head==null;
	}
	
	public static class Node<E>{
		public E data;
	    public Node<E> next;
		public Node(E data) {
			this.data = data;
			this.next = null;
		}
	}
}

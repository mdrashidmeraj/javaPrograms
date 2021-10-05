package stack;

public class Main {

	public static void main(String[] args) {
		MyStack s = new MyStack(3);
		MyStackLL<Integer> st = new MyStackLL<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.display();
		System.out.println(st.peek());
		System.out.println(st.pop());
		st.display();
		st.pop();
		st.pop();
		st.display();
	}

}

package stack;

import java.util.Stack;


public class MinEleInStackUsingExtraSpace {
	static Stack<Integer> st;
	static Stack<Integer> min;
	public static void main(String[] args) {
		int[] arr = {18,19,29,15,16};
		int n = arr.length;
		st = new Stack<>();
		min = new Stack<>();
		pushEle(18);
		pushEle(19);
		pushEle(29);
		popEle();
		System.out.println(minEle());
		pushEle(15);
		System.out.println(minEle());
		popEle();
			
	}
	static void pushEle(int a) {
		st.push(a);
		if(min.size() == 0) min.push(a);
		else if(a<min.peek()) min.push(a);
	}
	static int popEle() {
		if(st.size()<=0) return -1;
		int a = st.pop();
		if(a == min.peek()) min.pop();
		return a;
	}
	static int minEle() {
		if(min.size()>0) return min.peek();
		else return -1;
	}
	
}

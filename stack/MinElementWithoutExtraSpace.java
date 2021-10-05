package stack;

import java.util.*;

public class MinElementWithoutExtraSpace {
	static Stack<Integer> st;
	static int min; 
	public static void main(String[] args) {
		st = new Stack<>();
		min = Integer.MAX_VALUE;
		pushEle(18);
		pushEle(10);
		pushEle(29);
		popEle();
		System.out.println(minEle());
		pushEle(15);
		System.out.println(minEle());
		popEle();
		popEle();
		System.out.println(minEle());
		
	}
	static void pushEle(int a) {
		if(st.size() == 0) {
			st.push(a);
			min = a;
		}
		else if(a<min) {
			st.push(2*a-min);
			min = a;
		}else st.push(a);
	}
	static int popEle() {
		if(st.size()<=0) return -1;
		int a;
		if(st.peek()<min) {
			a = st.pop();
			min = 2*min - a; 
		}else a = st.pop();
		return a;
	}
	static int minEle() {
		if(st.size()<=0) return -1;
		return min;
	}
}

package stack;

import java.util.Stack;

public class MaximumAreaHistogram {
	
	static class Pair{
		int val;
		int idx;
		Pair(int val, int idx){
			this.val  = val;
			this.idx = idx;
		}
	}
	public static void main(String[] args) {
		int[] arr = {6,2,5,4,5,1,6};
		int n = arr.length;
		int[] ans = CalculateArea(arr, n);
		for(int i=0;i<n;i++) {
			System.out.print(ans[i] + " ");
		}

	}

	private static int[] CalculateArea(int[] arr, int n) {
		Stack<Pair> st = new Stack<>();
		int[] leftSmaller = new int[n];
		for(int i =0;i<n;i++) {
			if(st.size()>0) {
				while(st.size()> 0 && st.peek().val>=arr[i]) st.pop();
				if(st.size()>0) leftSmaller[i] = st.peek().idx;
				else leftSmaller[i] = -1;
			}else {
				leftSmaller[i] = -1;
			}
			st.push(new Pair(arr[i],i));
		}
		st = new Stack<>();
		int[] rightSmaller = new int[n];
		for(int i =n-1;i>=0;i--) {
			if(st.size()>0) {
				while(st.size()> 0 && st.peek().val>=arr[i]) st.pop();
				if(st.size()>0) rightSmaller[i] = st.peek().idx;
				else rightSmaller[i] = n;
			}else {
				rightSmaller[i] = n;
			}
			st.push(new Pair(arr[i],i));
		}
		int[] area = new int[n];
		for(int i =0;i<n;i++) {
			int width = rightSmaller[i] - leftSmaller[i] -1;
			area[i] = arr[i] * width;
		}
		return area;
	}

}

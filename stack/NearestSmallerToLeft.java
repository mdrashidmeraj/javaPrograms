package stack;

import java.util.Stack;

public class NearestSmallerToLeft {

	public static void main(String[] args) {
		int[] arr = {2,1,3,2,4};
		int n = arr.length;
		int[] ans = nearestSmallerToLeft(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(ans[i] + " ");
		}

	}

	private static int[] nearestSmallerToLeft(int[] arr, int n) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[n];
		for(int i =0;i<n;i++) {
			if(st.size()>0) {
				while(st.size()>0 && st.peek() > arr[i]) {
					st.pop();
				}
				if(st.size()>0) ans[i] = st.peek();
				else ans[i] = -1;
				st.push(arr[i]);
			}else {
				ans[i] = -1;
				st.push(arr[i]);
			}
		}
		return ans;
	}
	

}

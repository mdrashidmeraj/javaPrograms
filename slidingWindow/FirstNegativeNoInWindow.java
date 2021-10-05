package slidingWindow;

import java.util.Stack;

public class FirstNegativeNoInWindow {

	public static void main(String[] args) {
		int[] arr = {12,-1,7,8,15,30,-16,28};
		int k = 3;
		int n = arr.length;
		int i  =0;
		int j = 0;
		int t = 0;
		int[] ans = new int[n-k+1];
		Stack<Integer> st = new Stack<>();
		while(j<n) {
			if(arr[j] < 0) st.push(j);
			if(j-i+1 < k) j++;
			else {
				if(st.size() > 0) {
					int idx = st.peek();
					if(idx>=i) {
						ans[t++] = arr[idx];
						if(arr[i] == arr[idx]) st.pop();
					}
				}else {
					ans[t++] = 0;
				}
				i++;
				j++;
			}
			
		}
		for(int ele: ans) {
			System.out.println(ele);
		}

	}

}

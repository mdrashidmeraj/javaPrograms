package slidingWindow;

import java.util.*;
public class Maximumofallsubarraysofsizek {

	public static void main(String[] args) {
		int[] arr = {1,3,-1,-3,5,3,6,7};
		int k = 3; 
		int max = Integer.MIN_VALUE;
		Deque<Integer> dq = new ArrayDeque<Integer>();
		int ans[] = new int[arr.length-k+1];
		int i = 0;
		int j =0, t = 0;
		while(j<arr.length) {
			max = Math.max(max, arr[j]);
			while(dq.size()>0 && dq.peekFirst() < arr[j]) dq.pollFirst();
			dq.add(arr[j]);
			if(j-i+1 <k) j++;
			else {
				ans[t++] = max;
				if(arr[i] == max) {
					max = dq.peekFirst();
				}
				i++;
				j++;
			}
		}
		for(int ele : ans) System.out.println(ele);
	}

}

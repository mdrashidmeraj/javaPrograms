package stack;

import java.util.Stack;



public class MaximumAreaRectangle {
	
	static class Pair{
		int val;
		int idx;
		Pair(int val, int idx){
			this.val  = val;
			this.idx = idx;
		}
	}

	public static void main(String[] args) {
		int[][] arr = {	{0,1,1,0},
						{1,1,1,1},
						{1,1,1,1},
						{1,1,0,0}	};
		int n = arr.length;
		int[] row = new int[n];
		for(int j = 0;j<n;j++) {
			row[j] = arr[0][j];
		}
		int max = MaxAreaHistogram(row,n);
		for(int i = 1;i<n;i++) {
			for(int j = 0;j<n;j++) {
				if(arr[i][j] == 0) row[j] = 0;
				else row[j] += arr[i][j];
			}
			max = Math.max(max, MaxAreaHistogram(row,n));
		}
		System.out.println(max);

	}

	private static int MaxAreaHistogram(int[] arr, int n) {
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
		int max = 0;
		for(int i =0;i<n;i++) {
			int width = rightSmaller[i] - leftSmaller[i] -1;
			area[i] = arr[i] * width;
			max = Math.max(max,  area[i]);
		}
		
		return max;
	}
	

}

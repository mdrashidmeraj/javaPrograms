package dynamicProgramming;

import java.util.Arrays;

public class knapsack {
  static int t[][];
	public static void main(String[] args) {
		int[] wt = {5,9,4,8};
		int[] val = {2,4,5,8};
		int w = 4;
		int n = wt.length;
		 t = new int[n+1][w+1];
		for (int[] row : t) 
            Arrays.fill(row, -1);
		int ans = knapsackfunc(wt,val,w,n);
		System.out.println(ans);
	}	
	public static int knapsackfunc(int[] wt, int[] val,int w,int n) {
		if(w==0 || n==0) return 0;
		if(t[n][w] != -1) return t[n][w];
		if(wt[n-1]<=w) {
		 return t[n][w] =  Math.max((val[n-1]+knapsackfunc(wt,val,w-wt[n-1],n-1)),knapsackfunc(wt,val,w,n-1));
		}
		else {
			return t[n][w] = knapsackfunc(wt,val,w,n-1);
		}		
	}
}

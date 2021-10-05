package dynamicProgramming;

import java.util.Arrays;

public class Knapsacktopdown {
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
		for(int i=0;i<n+1;i++) 
			for(int j=0;j<w+1;j++) 
				if(i==0 || j== 0) t[i][j] = 0;
		for(int i=1;i<n+1;i++) {
			for(int j = 1;j<w+1;j++) {
				if(wt[i-1]<=j) {
					t[i][j] =Math.max(val[i-1]+t[i-1][j-wt[i-1]], t[i-1][j]); 
				}else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		
		return t[n][w];
		
	}
}

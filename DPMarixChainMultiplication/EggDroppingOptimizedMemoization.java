package DPMarixChainMultiplication;

import java.util.Arrays;

public class EggDroppingOptimizedMemoization {
	static int[][] t;
	public static void main(String[] args) {
		int e = 3;
		int f = 5;
		t = new int[e+1][f+1];
		for(int[] a: t)
			Arrays.fill(a, -1);
		int ans = solve(e,f);
		System.out.println(ans);
	}
	private static int solve(int e, int f) {
		if(f == 0 || f == 1) return f;
		if(e == 1) return f;
		if(t[e][f] != -1) return t[e][f];
		int min = Integer.MAX_VALUE;
		for(int k = 1;k<=f;k++) {
			int down,up;
			
			if(t[e-1][k-1] != -1) down = t[e-1][k-1];
			else {
				down = solve(e-1,k-1);
				t[e-1][k-1] = down;
			}
			if(t[e][f-k] != -1) up = t[e][f-k];
			else {
				up = solve(e,f-k);
				t[e][f-k] = up;
			}
			
			int temp = 1+ Math.max(down,up);       
			min = Math.min(min, temp);  
		}
		return t[e][f] = min;
	}

}

package DPLongestCommon;

import java.util.Arrays;

public class LCSMemoization {
	static int[][] t;
	public static void main(String[] args) {
		String x = "abcdgh";
		String y = "abedfhr";
		int n = x.length();
		int m = y.length();
		t = new int[n+1][m+1];
		for(int[] row:t) {
			Arrays.fill(row, -1);
		}
		int ans = lcs(x,y,n,m);
		System.out.println(ans);
	}
	private static int lcs(String x, String y, int i, int j) {
		if(i==0 || j==0) {
			return t[i][j] = 0;
		}
		if(t[i][j] != -1) return t[i][j];
		if(x.charAt(i-1) == y.charAt(j-1)) {
			return t[i][j] = 1+lcs(x,y,i-1,j-1);
		}else {
			return t[i][j] = Math.max(lcs(x,y,i,j-1),lcs(x,y,i-1,j));
		}		
	}
}

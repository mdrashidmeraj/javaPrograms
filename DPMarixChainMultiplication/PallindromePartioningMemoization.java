package DPMarixChainMultiplication;

import java.util.Arrays;

public class PallindromePartioningMemoization {
	static int t[][];
	public static void main(String[] args) {
		String s = "nitik";
		t = new int[s.length()][s.length()];
		for(int[] a: t)
			Arrays.fill(a, -1);
		int ans = solve(s.toCharArray(),0,s.length()-1);
		System.out.println(ans);
	}
	private static int solve(char[] s, int i, int j) {
		if(i>=j) return t[i][j] = 0;
		if(pallindrome(s,i,j)) return t[i][j] = 0;
		if(t[i][j] != -1) return t[i][j];
		int min = Integer.MAX_VALUE;
		for(int k = i;k<j;k++) {
			int temp = solve(s,i,k)+solve(s,k+1,j)+1;
			if(temp<min) min = temp;
		}
		return t[i][j] = min;
	}
	private static boolean pallindrome(char[] s, int i, int j) {
		int f = 0;
		while(i<=j) {
			if(s[i] == s[j]) {
				i++;
				j--;
			}else {
				f = 1;
				break;
			}
		}
		return f==0 ;
	}

}

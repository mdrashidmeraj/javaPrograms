package DPLongestCommon;

public class SequencePatternMatching {
	
	public static void main(String[] args) {
		
		String x = "ABX";
		String y = "SHAMIBKNGYGX";
		boolean ans = x.length() == lcs(x,y,x.length(),y.length());
		System.out.println(ans);
	}

	private static int lcs(String x, String y, int n, int m) {
		int[][] t = new int[n+1][m+1];
		for(int i =0;i<n+1;i++)
			for(int j = 0;j<m+1;j++)
				if(i==0 || j==0) t[i][j] =0;
		for(int i =1;i<n+1;i++) {
			for(int j =1;j<m+1;j++) {
				if(x.charAt(i-1) == y.charAt(j-1)) t[i][j] = t[i-1][j-1] +1;
				else t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
			}
		}
		return t[n][m];
	}
}

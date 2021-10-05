package DPLongestCommon;

public class ConvertAtoB {

	public static void main(String[] args) {
		String x = "heap";
		String y = "pea";
		int n = x.length();
		int m = y.length();
		int LCS = lcs(x,y,n,m);
		System.out.println(m-LCS);
		System.out.println(n-LCS);

	}
	private static int lcs(String x, String y, int n, int m) {
		int[][] t = new int[n+1][m+1];
		for(int i=0;i<n+1;i++)
			for(int j=0;j<m+1;j++)
				if(i==0 || j==0) t[i][j] = 0;
		for(int i=1;i<n+1;i++)
			for(int j =1;j<m+1;j++) {
				if(x.charAt(i-1) == y.charAt(j-1)) {
					t[i][j] = 1+t[i-1][j-1];
				}else {
					t[i][j] = Math.max(t[i][j-1],t[i-1][j]);
				}
			}				
		return t[n][m];
		
	}
}

package DPLongestCommon;

public class PrintLCS {

	public static void main(String[] args) {
		String x = "asdfghjkl";
		String y = "zxcdvgbjnhlv";
		int n = x.length();
		int m = y.length();
		String ans = lcs(x,y,n,m);
		System.out.println(ans);

	}
	private static String lcs(String x, String y, int n, int m) {
		String[][] t = new String[n+1][m+1];
		for(int i=0;i<n+1;i++)
			for(int j=0;j<m+1;j++)
				if(i==0 || j==0) t[i][j] = "";
		for(int i=1;i<n+1;i++)
			for(int j =1;j<m+1;j++) {
				if(x.charAt(i-1) == y.charAt(j-1)) {
					t[i][j] = t[i-1][j-1]+x.charAt(i-1);
				}else {
					//t[i][j] = Math.max(t[i][j-1],t[i-1][j]);
					if(t[i][j-1].length()>=t[i-1][j].length()) {
						t[i][j] = t[i][j-1];
					}else {
						t[i][j] = t[i-1][j];
					}				
				}
			}				
		return t[n][m];
		
	}

}

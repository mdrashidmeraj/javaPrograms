package DPLongestCommon;

public class PrintLCSII {
	
	public static void main(String[] args) {
		String x = "asdfghjkl";
		String y = "zxcdvgbjnhlv";
		StringBuffer ans = solution(x,y,x.length(),y.length());
		System.out.println(ans);
	}
	
	static StringBuffer solution(String x, String y, int n, int m) {
		int[][] t = new int[n+1][m+1];
		String res = "";
		for(int i =0;i<n;i++)
			for(int j = 0;j<m;j++)
				if(i==0 || j == 0) t[i][j] = 0;
		for(int i =1;i<n+1;i++) {
			for(int j = 1;j<m+1;j++) {
				if(x.charAt(i-1) == y.charAt(j-1)) {
					t[i][j] = t[i-1][j-1]+1;
					
				}else {
						t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
				}
			}
		}
		int i = n,j=m;
		while(i>0 && j>0) {
			if(x.charAt(i-1) == y.charAt(j-1)) {
				res += x.charAt(i-1);
				i--;j--;
			}else {
				if(t[i-1][j]>t[i][j-1]) i--;
				else j--;
			}
		}
		StringBuffer sbr = new StringBuffer(res);
		sbr.reverse();
		return sbr;
	}
}

package DPLongestCommon;

public class LCSRecursion {

	public static void main(String[] args) {
		String x = "abcdgh";
		String y = "abedfhr";
		int n = x.length();
		int m = y.length();
		int ans = lcs(x,y,n,m);
		System.out.println(ans);
	}

	private static int lcs(String x, String y, int i, int j) {
		if(i==0 || j==0) return 0;
		if(x.charAt(i-1) == y.charAt(j-1)) {
			return 1+lcs(x,y,i-1,j-1);
		}else {
			return Math.max(lcs(x,y,i,j-1),lcs(x,y,i-1,j));
		}
	}

}

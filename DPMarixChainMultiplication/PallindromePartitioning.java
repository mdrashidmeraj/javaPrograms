package DPMarixChainMultiplication;

public class PallindromePartitioning {

	public static void main(String[] args) {
		String s = "nitik";
		int ans = solve(s.toCharArray(),0,s.length()-1);
		System.out.println(ans);
	}

	private static int solve(char[] s, int i, int j) {
		if(i>=j) return 0;
		if(pallindrome(s,i,j)) return 0;
		int min = Integer.MAX_VALUE;
		for(int k = i;k<j;k++) {
			int temp = solve(s,i,k)+solve(s,k+1,j)+1;
			if(temp<min) min = temp;
		}
		return min;
	}

	private static boolean pallindrome(char[] s, int i, int j) {
		int f = 0;
		while(i<=j) {
			if(s[i] == s[j]) {
				i++;
				j--;
			}else{
				f=1; 
				break;
			}
		}
		
		if(f==1) return false;
		return true;
	}

}

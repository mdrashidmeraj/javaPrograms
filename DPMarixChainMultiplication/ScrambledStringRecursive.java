package DPMarixChainMultiplication;

public class ScrambledStringRecursive {

	public static void main(String[] args) {
		String a = "great";
		String b = "rgeat";
		if(a.length() != b.length()) {
			System.out.println(false);
		}else if(a.length() == 0 && b.length() == 0) {
			System.out.println(true);
		}else {
			boolean ans = solve(a,b);
			System.out.println(ans);
		}

	}
	
	private static boolean solve(String a, String b) {
		if(a.compareTo(b) == 0) return true;
		if(a.length() <=1) return false;
		
		int n = a.length();
		boolean flag = false;
		for(int i = 1;i <= n-1;i++) {
			if(
					(solve(a.substring(0,i), b.substring(n-i)) && solve(a.substring(i),b.substring(0,n-i))) 
															|| 
					(solve(a.substring(0,i), b.substring(0,i)) && solve(a.substring(i),b.substring(i)))
			  ){
				flag = true;
				break;
			}
		}
		return flag;
	}

}

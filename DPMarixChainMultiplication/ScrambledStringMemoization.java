package DPMarixChainMultiplication;

import java.util.HashMap;

public class ScrambledStringMemoization {
	static HashMap<String,Boolean> map;
	public static void main(String[] args) {
		String a = "great";
		String b = "rgeat";
		map = new HashMap<>();
		if(a.length() != b.length()) {
			System.out.println(false);
		}else if(a.length() == 0 && b.length() == 0) {
			System.out.println(true);
		}else {
			
			System.out.println(solve(a,b));
		}

	}
	
	private static boolean solve(String a, String b) {
		if(a.compareTo(b) == 0) return true;
		if(a.length() <=1) return false;
		String key = a+" "+b;
		if(map.containsKey(key)){
			return map.get(key);
		}
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
		map.put(key, flag);
		return flag;
	}
}

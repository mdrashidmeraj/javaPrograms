package DPMarixChainMultiplication;

import java.util.HashMap;

public class EvaluateExpressiontoTrueBooleanParenthesizationMemoization {
	
	static HashMap<String, Integer> map;
	
	public static void main(String[] args) {
		
		String s = "T^F&T|T";
		map = new HashMap<>();
		int ans = solve(s.toCharArray(), 0,s.length()-1, true);
		System.out.println(ans);
	}

	private static int solve(char[] s, int i, int j, boolean isTrue) {
		if(i>j) return 0;
		if(i == j) {
			if(isTrue) {
				return (s[i] == 'T') ? 1: 0;
			}else {
				return (s[i] == 'F') ? 1: 0;
			}
		}
		String key = i+"_"+j+"_"+ isTrue;
		if(map.containsKey(key)){
			return map.get(key);
		}
		int ans = 0;
		for(int k = i+1;k<j;k+=2) {
			int lt = solve(s,i,k-1,true);
			int lf = solve(s,i,k-1,false);
			int rt = solve(s,k+1,j,true);
			int rf = solve(s,k+1,j, false);
			
			if(s[k] == '&') {
				if(isTrue) {
					ans += lt*rt;
				}else {
					ans += lt*rf + rt*lf + lf*rf;
				}
			}else if(s[k] == '|') {
				if(isTrue) ans += lt*rt + lt*rf +lf*rt;
				else ans += lf*rf;
			}else if(s[k] == '^') {
				if(isTrue) ans += lt*rf + lf*rt;
				else ans += lt*rt + lf*rf;
			}
			
		}
		map.put(key, ans);
		return ans;
	}
}

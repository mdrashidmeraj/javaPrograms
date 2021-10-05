package slidingWindow;

import java.util.*;

public class MinimumWindowSubstring {

	public static void main(String[] args) {
		
		String s = "totmtaptat";
		String t = "tta";
		HashMap<Character, Integer> map = new HashMap<>();
		int unique = 0;
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<t.length();i++) {
			if(!map.containsKey(t.charAt(i))) {
				map.put(t.charAt(i), 1);
				unique++;
			}
			else 
				map.put(t.charAt(i), map.get(t.charAt(i))+1);
		}
		
		int i =0;
		int j =0;
		
		while(j<s.length()) {
			char ch = s.charAt(j);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)-1);
				if(map.get(ch) == 0) unique--;
			}
			if(unique > 0) j++;
			else {
				if(unique == 0) {
					ans = Math.min(ans, j-i+1);
				}
				while(unique == 0) {
					if(map.containsKey(s.charAt(i))) {
						map.put(s.charAt(i), map.get(s.charAt(i))+1);
						if(map.get(s.charAt(i)) == 1) {
							unique++;
							ans = Math.min(ans, j-i+1);
						}
					}	
					i++;
				}
				j++;
			}
		}
		System.out.println(ans);
	}
}

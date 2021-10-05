package slidingWindow;

import java.util.*;
public class LargestSubStringWithKUniqueCharacters {
	public static void main(String[] args) {
		String s = "aabacbebebe";
		int k = 3;
		int unique = 0;
		int max = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		int i =0, j = 0;
		while(j< s.length()) {
			char ch = s.charAt(j);
			if(map.get(ch) == null || map.get(ch) == 0) {
				unique++;
				map.put(ch,1);
			}else {
				map.put(ch,map.get(ch)+1);
			}
			if(unique<k) j++;
			else if(unique == k) {
				max = Math.max(j-i+1, max);
				j++;
			}
			else if(unique>k) {
				while(unique>k) {
					map.put(s.charAt(i), map.get(s.charAt(i))-1);
					if(map.get(s.charAt(i))== 0) unique--;
					i++;
				}
				j++;
			}
		}
		
		System.out.println(max);	
		
	}
}

package slidingWindow;

import java.util.*;

public class CountOccuranceOfAnagram {

	public static void main(String[] args) {
		
		String str = "forxoxorfxaoofro";
		int n = str.length();
		String ptrn = "foro";
		int k = ptrn.length();
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0;i<k;i++) {
			if(map.containsKey(ptrn.charAt(i))) {
				map.put(ptrn.charAt(i), map.get(ptrn.charAt(i))+1);
			}
			else map.put(ptrn.charAt(i), 1);
		}
		int cnt = map.size();
		int i =0;
		int j = 0;
		int ans = 0;
		while(j<n) {
			char ch = str.charAt(j);
			if(map.containsKey(ch)) {
				map.put(str.charAt(j), map.get(ch)-1);
				if(map.get(ch) == 0) cnt--;
			}
			if(j-i+1 < k) j++;
			else {
				if(cnt == 0) {
					ans++;
				}
				if(map.containsKey(str.charAt(i))) {
					map.put(str.charAt(i), map.get(str.charAt(i))+1);
					if(map.get(str.charAt(i)) == 1) cnt++;
				}
				i++;
				j++;
			}

		}
		System.out.println(ans);
	}

}

package slidingWindow;
import java.util.*;
public class LongestSubArrayOfSizeK {

	public static void main(String[] args) {
		
		int[] arr = {4,1,1,1,-2,4,5};
		int n = arr.length;
		int k = 5;
		int sum = 0;
		int ans = Integer.MIN_VALUE;
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(0,0);
		for(int i =0;i<n;i++) {
			sum+= arr[i];
			if(map.containsKey(sum-k)) {
				ans = Math.max(ans, i-map.get(sum-k)+1);
			}
			map.putIfAbsent(sum, i+1);
		}
		System.out.println(ans);	

	}

}

package heap;

import java.util.PriorityQueue;

public class SortKsortedArray {
	public static void main(String[] args) {
		int[] arr = {6,5,3,2,8,10,9};
		int k = 3;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int t = 0;
		for(int i = 0;i<arr.length;i++) {
			pq.add(arr[i]);
			if(pq.size()>k) {
				arr[t++] = pq.poll();
			}
		}
		for(int i = 0;i<k;i++) {
			arr[t++] = pq.poll();
		}
		for(int i:arr) {
			System.out.println(i);
		}
	}
}

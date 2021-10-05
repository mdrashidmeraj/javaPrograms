package heap;

import java.util.*;

public class KthSmallest {

	public static void main(String[] args) {
		
		Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		int[] arr = {7,10,4,3,20,15};
		
		int k = 3;
		for(int i =0;i<arr.length;i++) {
			maxHeap.add(arr[i]);
			if(maxHeap.size()>k) {
				maxHeap.poll();
			}
		}
		System.out.println(maxHeap.peek());

	}

}

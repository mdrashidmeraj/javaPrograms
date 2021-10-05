package heap;

import java.util.*;

public class SumOfElementsbwK1andK2 {

	public static void main(String[] args) {
		int arr[] = {1,53,7,2,8,4,9,11,10,99};
		int k1 = 2;
		int k2 = 5;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0;i<arr.length;i++) {
			pq.add(arr[i]);
			if(pq.size()>=k2) pq.poll();
		}
		int sum = 0;
		while(pq.size()>k1) {
			sum+= pq.poll();
		}
		System.out.println(sum);

	}

}

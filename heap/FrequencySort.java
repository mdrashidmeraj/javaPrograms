package heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

import heap.TopKFrequentNumbers.Pair;
import heap.TopKFrequentNumbers.comparable;

public class FrequencySort {
	
	static class Pair {
		int ele;
		int freq;
		Pair(int ele, int freq){
			this.ele = ele;
			this.freq = freq;
		}
	}
	static class comparable implements Comparator<Pair>{
		
		public int compare(Pair p1, Pair p2) {
			if(p1.freq < p2.freq) return 1;
			else return -1;
		}
	}
	
	public static void main(String[] args) {
		int[] arr =  {1,1,1,3,3,3,2,2,4};
		HashMap<Integer, Integer> map = new HashMap<>();
		PriorityQueue<Pair> pq = new PriorityQueue<>(new comparable());
		for(int i =0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		for(int i : map.keySet()) {
			pq.add(new Pair(i, map.get(i)));
		}
		int t =0;
		while(pq.size()>0) {
			for(int i = 0;i<pq.peek().freq;i++) {
				arr[t++] = pq.peek().ele;
			}
			pq.poll();
		}
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}

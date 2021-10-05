package heap;

import java.util.*;

public class TopKFrequentNumbers {
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
			if(p1.freq > p2.freq) return 1;
			else return -1;
		}
	}

	public static void main(String[] args) {
		int[] arr =  {1,1,1,3,2,2,4};
		int k = 2;
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
			if(pq.size()>k) pq.poll();
		}
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0;i<k;i++) {
			al.add(pq.poll().ele);
		}
		for(int i : al) {
			System.out.println(i);
		}
	}

}

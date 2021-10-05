package heap;

import java.util.*;
public class KclosestNumbers {
	
	static class Pair {
		int key;
		int value;
		Pair(int key, int value){
			this.key = key;
			this.value = value;
		}
	}
	static class comparable implements Comparator<Pair>{

		@Override
		public int compare(Pair o1, Pair o2) {
			if(o1.key>o2.key) return -1;
			else return 1;
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {5,6,7,8,9};
		int k = 3;
		int x = 7;
		PriorityQueue<Pair> pq = new PriorityQueue<>(new comparable());
		for(int i = 0;i<arr.length;i++) {
			pq.add(new Pair(Math.abs(arr[i]-x),arr[i]));
			if(pq.size()>k) {
				pq.poll();
			}
		}
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0;i<k;i++) {
			al.add(pq.poll().value);
		}
		for(int i : al) {
			System.out.println(i);
		}
		
	}
}

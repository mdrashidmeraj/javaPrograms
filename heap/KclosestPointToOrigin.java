package heap;

import java.util.*;

public class KclosestPointToOrigin {
	static class Pair{
		double dist;
		int[] arr;
		Pair(double dist, int[] arr){
			this.dist = dist;
			this.arr = arr;
		}
	}
	
	static class comparable implements Comparator<Pair>{
		public int compare(Pair p1, Pair p2) {
			if(p1.dist>p2.dist) return -1;
			else return 1;
		}
	}

	public static void main(String[] args) {
		int[][] arr = { {1,3},
						{-2,2},
						{5,8},
						{0,1} };
		int k = 2;
		PriorityQueue<Pair> pq = new PriorityQueue<>(new comparable());
		for(int[] a: arr) {
			double dist = Math.pow(a[0], 2) + Math.pow(a[1], 2);
			pq.add(new Pair(dist, a));
			if(pq.size()>k) {
				pq.poll();
			}
		}
		for(int i = 0;i<k;i++) {
			int a[] = pq.poll().arr;
			for(int e:a) {
				System.out.print(e+" ");
			}
			System.out.println();
		}

	}

}

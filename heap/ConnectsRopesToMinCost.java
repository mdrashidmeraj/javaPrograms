package heap;
import java.util.*;
public class ConnectsRopesToMinCost {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int minCost = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i: arr) pq.add(i);
		
		while(pq.size()>1) {
			int cost = pq.poll() + pq.poll();
			minCost += cost;
			pq.add(cost);
		}
		
		System.out.println(minCost);
	}

}

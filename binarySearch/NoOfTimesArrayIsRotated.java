package binarySearch;

public class NoOfTimesArrayIsRotated {

	public static void main(String[] args) {
		
		int[] arr = {7,10,12,13,2,5,6};
		int n = arr.length;
		int start =0;
		int end = n-1;
		int idx = -1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			int next = (mid+1) % n;
			int prev = (mid-1 + n) %n;
			if( arr[mid] <arr[next] && arr[mid] <arr[prev]) {
				idx = mid;
				break;
			}
			else {
				if(arr[mid] <=arr[end] && arr[mid]>= arr[start]) {
					idx = start;
					break;
					
				}else if(arr[mid]>= start) start = mid+1;
				else end = mid-1;
			}
			
		}
		System.out.println(n-idx);
	}

}

package binarySearch;

public class MinDiff {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,8,10,10,12,19};
		int key = 9;
		int start = 0;
		int end =arr.length-1;
		int res = -1;
		int diff = Integer.MAX_VALUE;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(arr[mid] == key) {
				res = arr[mid];
				break;
			}
			else if(arr[mid]<key) {
				start = mid+1;
				if(Math.abs(key - arr[mid]) < diff) res = arr[mid];
				
			}
		
			else if(arr[mid]>key) {
				end = mid-1;
				if(Math.abs(key - arr[mid]) < diff) res = arr[mid];
			}
		}
		System.out.println(res);
		
	}

}

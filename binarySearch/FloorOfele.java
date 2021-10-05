package binarySearch;

public class FloorOfele {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,8,10,10,12,19};
		int ele = 5;
		int n = arr.length;
		int start = 0;
		int end = n-1;
		int res = -1;
		while(start<=end) {
			int mid =  start + (end-start)/2;
			
			if(arr[mid] == ele) {
				res = ele;
				break;
			}
			
			else if(arr[mid] < ele) {
				res = arr[mid];
				start = mid+1;
			}
			
			else if(arr[mid] > ele) {
				end = mid-1;
			}
		}
		System.out.println(res);
	}

}

package binarySearch;

public class AllocateMinimumNumberOfPages {

	public static void main(String[] args) {
		int[] arr = {10,20,40,30};
		int n = arr.length;
		int k =2;
		int start = 0;
		int end = 0;
		for(int i =0;i<n;i++) {
			start = Math.max(arr[i], start);
			end += arr[i];
		}
		int res = -1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(isValid(arr, n, k, mid)) {
				res = mid;
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		System.out.println(res);
	}

	private static boolean isValid(int[] arr, int n, int k, int mid) {
		int stud = 1;
		int sum = 0;
		for(int i =0;i<n;i++) {
			sum+=arr[i];
			if(sum>mid) {
				stud++;
				sum = arr[i];
			}
			if(stud>k) return false;
		}
		return true;
	}

}

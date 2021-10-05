package binarySearch;

public class NextLetter {

	public static void main(String[] args) {
		char[] arr = {'a','c','f','h'};
		char key = 'd';
		int start = 0;
		int end = arr.length-1;
		//int n = arr.length;
		char res = '1';
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(arr[mid] == key) {
				start = mid+1;
			}
			else if(arr[mid] > key) {
				res = arr[mid];
				end = mid-1;
			}
			else if(arr[mid]<key) {
				start = mid+1;
			}
		}
		System.out.println(res);

	}

}

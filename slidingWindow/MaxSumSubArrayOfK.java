package slidingWindow;

public class MaxSumSubArrayOfK {

	public static void main(String[] args) {
		int[] arr = {2,5,1,8,2,9,1};
		int k = 3;
		int n = arr.length;
		int sum = 0;
		for(int i = 0;i<k;i++) {
			sum+=arr[i];
		}
		int max = sum;
		for(int i = 1;i<=n-k;i++) {
			sum = sum-arr[i-1]+arr[i+k-1];
			max = Math.max(sum, max);
		}
		System.out.println(max);

	}

}

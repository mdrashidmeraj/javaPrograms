package dynamicProgramming;

public class EqualSumPartition {
	public static void main(String[] args) {
		int[] arr = {2,7,11};
		int s =0;
		//int sum = 10;
		for(int i=0;i<arr.length;i++) {
			s+=arr[i];
		}
		if(s%2 == 0) {
			System.out.println(subsetsum(arr,s/2,arr.length));
		}else {
			System.out.println(false);
		}
	}
	public static boolean subsetsum(int[] arr , int sum, int n) {
		boolean[][] t = new boolean[n+1][sum+1];
		for(int i=0;i<=n;i++) {
			for(int j = 0;j<=sum;j++) {
				if(i == 0) t[i][j] = false;
				if(j==0) t[i][j] = true;
			}
		}
		for(int i =1;i<n+1;i++) {
			for(int j =1;j<sum+1;j++) {
				if(arr[i-1]<=j) {
					t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
				}else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		return t[n][sum];
	}

}

package dynamicProgramming;

public class TargetSum {
	public static void main(String[] args) {
		int[] arr = {1,1,2,3};										//s1-s2 = sum
		int sum = 1;
		int range =0;
		for(int i:arr) range+=i;
		int s1 = (range+sum)/2;
		int ans = countSubset(arr,s1,arr.length);
		System.out.println(ans);
		
	}
	public static int countSubset(int[] arr, int sum,int n) {
		int[][] t = new int[n+1][sum+1];
		for(int i=0;i<n+1;i++)
			for(int j=0;j<sum+1;j++) {
				if(i==0) t[i][j] = 0;
				if(j==0) t[i][j] = 1;
			}
		for(int i=1;i<n+1;i++) {
			for(int j = 1;j<sum+1;j++) {
				if(arr[i-1]<=j) {
					t[i][j] = t[i-1][j-arr[i-1]] + t[i-1][j];
				}else t[i][j] = t[i-1][j];
			}
		}
		return t[n][sum];
				
	}
}

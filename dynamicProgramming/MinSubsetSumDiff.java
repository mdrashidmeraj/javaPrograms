package dynamicProgramming;

public class MinSubsetSumDiff {

	public static void main(String[] args){
		int[] arr = {1, 6, 11, 20};
		int range =0;
		for(int i:arr) {
			range+=i;
		}
		int ans = minDiff(arr,range,arr.length);	
		System.out.println(ans);
	}
	public static int minDiff(int[] arr , int sum, int n) {
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
		int diff = Integer.MAX_VALUE;
        for (int j = sum / 2; j >= 0; j--)
        {            
            if (t[n][j] == true)
            {
                diff = sum - 2*j;
                break;
            }
        }
        return diff;
	}
}

package DPMarixChainMultiplication;

public class MCMRecursion {
	
	public static void main(String[] args) {
		int[] arr = {4,2,3,1,3};
		
		int ans = solve(arr, 1, arr.length-1);
		System.out.println(ans);
	}

	private static int solve(int[] arr, int i, int j) {
		if(i>=j)  return 0;
		int min = Integer.MAX_VALUE;
		for(int k =i;k<j;k++) {
			int tempans = solve(arr, i,k)+solve(arr,k+1,j)+(arr[i-1]*arr[k]*arr[j]);
			
			if(tempans<min) min = tempans;
		}
		
		return min;
	}
}

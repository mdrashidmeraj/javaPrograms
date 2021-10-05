 package DPUnboundedKnapsack;

public class RodCutting {

	public static void main(String[] args) {
		int length[] = {1,2,3,4,5,6,7,8};
		int price[] = {1,5,8,9,10,17,17,20};
		int l = 8;
		int n = length.length;
		int ans = unboundedKnapsack(length,price,l,n);
		System.out.println(ans);

	}
	public static int unboundedKnapsack(int[] length,int[] price, int l, int n) {
		int[][] t = new int[n+1][l+1];
		for(int i=0;i<n+1;i++) 
			for(int j=0;j<l+1;j++) 
				if(i==0 || j== 0) t[i][j] = 0;
		for(int i=1;i<n+1;i++) {
			for(int j = 1;j<l+1;j++) {
				if(length[i-1]<=j) {
					t[i][j] =Math.max(price[i-1]+t[i][j-length[i-1]], t[i-1][j]); 
				}else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		
		return t[n][l];
		
	}

}

package DPUnboundedKnapsack;

public class CoinChangeMinNoOfCoin {

	public static void main(String[] args) {
		int[] coin = {2,5,10,1};
				
		int sum = 27;
		int n = coin.length;
		int ans = solution(coin,sum,n);
		System.out.println(ans);
	}

	public static int solution(int[] coin, int sum, int n) {
		int[][] t = new int[n+1][sum+1];
		for(int i=0;i<n+1;i++)
			for(int j=0;j<sum+1;j++) {
				if(j==0) t[i][j] = 0;
				if(i==0) t[i][j] = Integer.MAX_VALUE-1;
				if(i==1 && j != 0) {
					if(j%coin[0] == 0) t[i][j] = j/coin[0];
					else t[i][j] = Integer.MAX_VALUE-1;
				}
			}
		for(int i = 2;i<n+1;i++) {
			for(int j=1;j<sum+1;j++) {
				if(coin[i-1]<=j) {
					t[i][j] = Math.min( 1+t[i][j-coin[i-1]], t[i-1][j]);
				}else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		return t[n][sum];		
		
	}

}

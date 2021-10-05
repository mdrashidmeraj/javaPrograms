package DPMarixChainMultiplication;

public class EggDroppingrecursive {

	public static void main(String[] args) {
		int e = 3;
		int f = 5;
		int ans = solve(e,f);
		System.out.println(ans);

	}

	private static int solve(int e, int f) {
		if(f == 0 || f == 1) return f;
		if(e == 1) return f;
		int min = Integer.MAX_VALUE;
		for(int k = 1;k<=f;k++) {
			int temp = 1+ Math.max(solve(e-1,k-1), solve(e,f-k));       //max kyunki hame worst case chahiye;
			min = Math.min(min, temp);           						//min  kyunki hame worst case me min atttempt chahiye
		}
		return min;
	}

}

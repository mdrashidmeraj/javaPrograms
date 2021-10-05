package advanceRecursion;

public class CionGame {

	public static void main(String[] args) {
		int arr[] = {1,5,700,3,2,4};
		System.out.println(coinMax(arr,0,arr.length-1));
	}
	static int coinMax(int a[], int l,int r){
		if(l+1 == r) {
			return Math.max(a[l],a[r]);
		}
		return Math.max(a[l]+Math.min(coinMax(a,l+2,r),coinMax(a,l+1,r-1)),a[r]+Math.min(coinMax(a,l+1,r-1),coinMax(a,l,r-2)) );
	}

}

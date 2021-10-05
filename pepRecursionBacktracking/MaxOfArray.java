package pepRecursionBacktracking;

import java.util.*;

public class MaxOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       int[] a = new int[n];
	       for(int i=0;i<n;i++){
	            a[i] = sc.nextInt();
	       }
	       int max = maxOfArray(a,0);
	       System.out.println(max);
	}
	public static int maxOfArray(int[] arr, int idx) {
        if(idx == arr.length-1) return arr[idx];
       int misa = maxOfArray(arr,idx+1);
       return misa>arr[idx]? misa:arr[idx];
       
    }

}

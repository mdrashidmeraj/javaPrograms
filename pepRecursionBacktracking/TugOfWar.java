package pepRecursionBacktracking;

import java.util.*;
public class TugOfWar {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		solve(arr, 0, new ArrayList<>(), new ArrayList<>(), 0, 0);
		System.out.println(ans);
	}

	static int mindiff = Integer.MAX_VALUE;
	static String ans = "";

	public static void solve(int[] arr, int vidx, ArrayList<Integer> set1, ArrayList<Integer> set2, int soset1,
			int soset2) {
		
		if(vidx == arr.length){
		    int delta = Math.abs(soset1-soset2);
		    if(delta<mindiff){
		        mindiff = delta;
		        ans = set1+" "+set2;
		    }
		    return;
		}
		int ele = arr[vidx];
		if(set1.size()<(arr.length+1)/2){
		  	set1.add(ele);
    		solve(arr,vidx+1,set1,set2,soset1+ele,soset2);
    		set1.remove(set1.size()-1);  
		}
		if(set2.size()<(arr.length+1)/2){
    		set2.add(ele);
    		solve(arr,vidx+1,set1,set2,soset1,soset2+ele);
    		set2.remove(set2.size()-1);
		}
	}
}

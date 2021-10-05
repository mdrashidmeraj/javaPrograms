package pepRecursionBacktracking;

import java.util.*;

public class KSubsetWithEqualSum {


	public static void solution(int[] arr, int vidx,int n , int k,int[] subsetSum,int ssssf, ArrayList<ArrayList<Integer>> ans) {
	    if(vidx == n){
	        if(ssssf == k){
	            boolean flag = true;
	            for(int i =0;i<subsetSum.length-1;i++)
	                if(subsetSum[i] != subsetSum[i+1]){
	                    flag = false;
	                    break;
	                } 
	            if(flag){
	                for(ArrayList<Integer> set:ans){
	                    System.out.print(set+" ");
	                }
	                System.out.println();
	            }
	        }
	        return;
	    }
	    int ele = arr[vidx];
	    for(int i=0;i<ans.size();i++){
	        if(ans.get(i).size()>0){
	            ans.get(i).add(ele);
	            subsetSum[i] += ele;
	            solution(arr,vidx+1,n,k,subsetSum,ssssf,ans);
	            ans.get(i).remove(ans.get(i).size()-1);
	            subsetSum[i] -= ele;
	            
	        }else{
	            ans.get(i).add(ele);
	            subsetSum[i] += ele;
	            solution(arr,vidx+1,n,k,subsetSum,ssssf+1,ans);
	            ans.get(i).remove(ans.get(i).size()-1);
	            subsetSum[i] -= ele;
	            break;
	        }
	    }
	        
	    
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for(int i =  0 ; i < arr.length; i++) {
			arr[i] = scn.nextInt();
			sum += arr[i];
		}
		int k = scn.nextInt();
		// if k is equal to 1, then whole array is your answer 
		if(k == 1) {
			System.out.print("[");
			for(int i = 0 ; i  < arr.length; i++) {
				System.out.print(arr[i] + ", ");
			}
			System.out.println("]");
			return;
		}
		//if there are more subsets than no. of elements in array or sum of all elements is not divisible by k
		if(k > n || sum % k != 0) {
			System.out.println("-1");
			return;
		}
		int[] subsetSum = new int[k];
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for(int i = 0; i < k; i++) {
			ans.add(new ArrayList<>());
		}
		solution(arr,0,n,k,subsetSum,0,ans);
	}

}

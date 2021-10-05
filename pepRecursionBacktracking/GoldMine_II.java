package pepRecursionBacktracking;

import java.io.*;
import java.util.*;

public class GoldMine_II {
	
		static int max = 0;
		
		
		public static void collect(int[][] arr,int i,int j,ArrayList<Integer> bag, boolean[][] visited){
		    
		    if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || visited[i][j] == true || arr[i][j] == 0){
		        return;
		    }
		    visited[i][j] = true;
		    bag.add(arr[i][j]);
		    
		    collect(arr,i,j+1,bag,visited);
		    collect(arr,i,j-1,bag,visited);
		    collect(arr,i+1,j,bag,visited);
		    collect(arr,i-1,j,bag,visited);
		} 
		public static void getMaxGold(int[][] arr){
			
			boolean[][] visited = new boolean[arr.length][arr[0].length];
			for(int i=0;i<arr.length;i++){
			    for(int j= 0;j<arr[i].length;j++){
			        if(arr[i][j] != 0){
			            ArrayList<Integer> bag = new ArrayList<>();
			            
			            collect(arr,i,j,bag,visited);
			            int sum = 0;
			            for(int val:bag){
			                sum+=val;
			            }
			            if(sum>max) max = sum;
			        }
			    }
			}
			
		}
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			int m = scn.nextInt();
			int[][] arr = new int[m][n];
			for(int i = 0; i < arr.length; i++){
				for(int j = 0 ; j  < arr[0].length; j++){
					arr[i][j] = scn.nextInt();
				}
			}
			getMaxGold(arr);
			System.out.println(max);
		}
			
	
}

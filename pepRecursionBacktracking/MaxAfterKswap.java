package pepRecursionBacktracking;
import java.io.*;
import java.util.*;

public class MaxAfterKswap {
	    
	    public static String swap(String str, int i, int j){
	        char ith = str.charAt(i);
	        char jth = str.charAt(j);
	        
	        return str.substring(0,i)+ jth +str.substring(i+1, j) + ith + str.substring(j+1); 
	    }

		static String max;
		public static void findMaximum(String str, int k) {
		
			    if(Integer.parseInt(str)>Integer.parseInt(max)) max = str;

			    

			if(k == 0){
			    return;
			    
			}
			
			for(int i = 0;i<str.length() - 1;i++){
			    for(int j = i+1;j<str.length();j++){
	    		    if(str.charAt(j)>str.charAt(i)){
	    		        String swaped = swap(str,i,j);
	    		        findMaximum(swaped,k-1);
	    		    }
			    }
			}
		}
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			String str = scn.next();
			int k = scn.nextInt();
			 max = str;
			findMaximum(str, k);
			System.out.println(max);
		}

	
}

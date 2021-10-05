//print all subsequence

package pepRecursionBacktracking;

import java.util.*;

public class PrintSubsequence {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String str = sc.next();
	        printSS(str,"");
	}
	
	    public static void printSS(String str,String ans) {
	        if (str.length() == 0) {
	            System.out.println(ans);
	            return;
	        }
	        char ch = str.charAt(0);
	        String rst = str.substring(1);
	        printSS(rst,ans+ch);
	        printSS(rst,ans+"");

	    }

	
}

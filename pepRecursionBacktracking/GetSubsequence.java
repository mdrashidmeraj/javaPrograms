//get all subsequence of a string

package pepRecursionBacktracking;

import java.util.*;

public class GetSubsequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    ArrayList<String> ar = gss(str);
	    System.out.println(ar);
	}
	public static ArrayList < String > gss(String str) {
        if(str.length() == 0){
            ArrayList<String> ar = new ArrayList<>();
            ar.add("");
            return ar;
        }
        char ch = str.charAt(0);
        String rst = str.substring(1);    //rest of string without first element
        ArrayList<String> res = gss(rst);
        ArrayList<String> myres = new ArrayList<>();   //result string
        for(String st:res){
            myres.add(""+st);    
        }
        for(String st:res){
            myres.add(ch+st);
        }
        return myres;
    }
}

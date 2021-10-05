package pepRecursionBacktracking;

import java.util.*;

public class PallindromicPartition {
	public static void solution(String str, String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        for(int i = 0;i<str.length();i++){
            String pre = str.substring(0,i+1);
            
            if(ispalindrome(pre)){
            	String ros = str.substring(i+1);
                solution(ros,asf+"("+pre+") ");
            }
        }
    }
    public static boolean ispalindrome(String s){
        int li = 0;
        int ri = s.length()-1;
        while(li<ri){
            if(s.charAt(li) != s.charAt(ri)){
                return false;
            }
            li++;ri--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution(str, "");
    }
}

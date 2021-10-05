package pepRecursionBacktracking;
import java.io.*;
import java.util.*;

public class RemoveInvalidParanthesis {

		public static void solution(String str, int minRemoval, HashSet<String> ans) {
			if(minRemoval == 0){
			    if(getMin(str) == 0){
			      if(ans.contains(str) == false){
			          ans.add(str);
			          System.out.println(str);
			      }  
			    } 
			    return;
			}
			for(int i = 0;i<str.length();i++){
			    String s = str.substring(0,i)+str.substring(i+1);
			    solution(s,minRemoval-1,ans);
			}
		}

		public static int getMin(String str){
		    int open = 0;
		    int notbalance = 0;
			for(int i = 0;i<str.length();i++){
			    char ch = str.charAt(i);
			    if(ch == '(') open++;
			    else {
			        if(open>0) open--;
			        else notbalance++;
			    }
			        
			}
			return notbalance+open;
		}
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			String str = scn.next();
			solution(str, getMin(str),new HashSet<>());
		}
			

}

package pepRecursionBacktracking;
import java.io.*;
import java.util.*;

public class PatternMatching {
		public static void solution(String str, String pattern, HashMap<Character,String> map, String op){

			if(pattern.length()== 0){
			    if(str.length() == 0){
			        HashSet<Character> alreadyPrinted = new HashSet<>();
			        for(int i = 0;i<op.length();i++){
			        char ch = op.charAt(i);
	    		        if(alreadyPrinted.contains(ch) == false){
	    		            System.out.print(ch +" -> "+map.get(ch)+", ");
	    		            alreadyPrinted.add(ch);
	    		        }
	    		    }
	    		    System.out.println(".");
			    }
			    return;
			}
			
			char ch = pattern.charAt(0);
			String rop = pattern.substring(1);
			if(map.containsKey(ch)){
			    String previousMap =  map.get(ch);
			    if(str.length()>=previousMap.length()){
			        String left = str.substring(0,previousMap.length());
			        if(left.equals(previousMap)){
			            solution(str.substring(previousMap.length()),rop,map, op);
			        }
			    }
			}else{
			    for(int i = 0;i<str.length();i++){
			        String prefix = str.substring(0,i+1);
			        map.put(ch, prefix);
			        String ros = str.substring(i+1);
			        solution(ros,rop,map,op);
			        map.remove(ch);
			    }    
			}
			
		}
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			String str = scn.next();
			String pattern = scn.next();
			HashMap<Character,String> map = new HashMap<>();
			solution(str,pattern,map,pattern);
		}
}

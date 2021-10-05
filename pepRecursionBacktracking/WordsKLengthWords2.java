package pepRecursionBacktracking;
import java.io.*;
import java.util.*;


public class WordsKLengthWords2 {

	    public static void generate(int cs, String str, HashSet<Character> set, int ts,String asf){
	        if(cs == ts){
	            System.out.println(asf);
	            return;
	        }
	        
	        
	        for(int i = 0;i<str.length();i++){
	            if(set.contains(str.charAt(i))){
	                set.remove(str.charAt(i));
	                generate(cs+1,str,set,ts,asf+str.charAt(i));
	                set.add(str.charAt(i));
	            }
	        }
	        
	    }

	  public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    int k = Integer.parseInt(br.readLine());

	    HashSet<Character> unique = new HashSet<>();
	    String ustr = "";
	    for (char ch : str.toCharArray()) {
	      if (unique.contains(ch) == false) {
	        unique.add(ch);
	        ustr += ch;
	      }
	    }

	    generate(0,ustr,unique,k,"");
	  }

	
}

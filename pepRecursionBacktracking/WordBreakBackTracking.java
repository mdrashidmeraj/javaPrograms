package pepRecursionBacktracking;

import java.util.HashSet;
import java.util.Scanner;

public class WordBreakBackTracking {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        HashSet < String > dict = new HashSet < > ();
        for (int i = 0; i < n; i++) {
            dict.add(scn.next());
        }
        String sentence = scn.next();
        wordBreak(sentence, "", dict);
	}
	public static void wordBreak(String str, String ans, HashSet < String > dict) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0;i<str.length();i++){
            String s = str.substring(0,i+1);
            if(dict.contains(s)){
                String ros = str.substring(i+1);
                wordBreak(ros,ans+s+" ",dict);
            }
        }
    }

}

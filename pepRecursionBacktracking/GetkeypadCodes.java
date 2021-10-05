//print string combination according to input digit
/*
   0 -> .;
    1 -> abc
    2 -> def
    3 -> ghi
    4 -> jkl
    5 -> mno
    6 -> pqrs
    7 -> tu
    8 -> vwx
    9 -> yz
 */
package pepRecursionBacktracking;

import java.util.*;
public class GetkeypadCodes {
	static Map<Character,String> map = new HashMap<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        map.put('0',".;");
        map.put('1',"abc");
        map.put('2',"def");
        map.put('3',"ghi");
        map.put('4',"jkl");
        map.put('5',"mno");
        map.put('6',"pqrs");
        map.put('7',"tu");
        map.put('8',"vwx");
        map.put('9',"yz");
        System.out.println(getKPC(str));
	}
	public static ArrayList < String > getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> ar = new ArrayList<>();
            ar.add("");
            return ar;
        }
        char ch = str.charAt(0);
        String rst = str.substring(1);
        ArrayList<String> res = getKPC(rst);
        ArrayList<String> myres = new ArrayList<>();
        String m = map.get(ch);
        for(int i = 0;i<m.length();i++){
            char c = m.charAt(i);
            for(String st:res){
                myres.add(c+st);
            }
        }
        return myres;
    }
}

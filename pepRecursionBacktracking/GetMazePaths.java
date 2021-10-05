// total path to move from left top corner to bottom right corner
package pepRecursionBacktracking;

import java.util.*;

public class GetMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(getMazePaths(1,1,n,m));
    }
    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList < String > getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc == dc){
            ArrayList<String> ar = new ArrayList<>();
            ar.add("");
            return ar;
        }else if(sr>dr || sc>dc){
            ArrayList<String> ar = new ArrayList<>();
            return ar;
        }
        ArrayList<String> r1 = getMazePaths(sr+1,sc,dr,dc);
        ArrayList<String> c1 = getMazePaths(sr,sc+1,dr,dc);
        
        ArrayList<String> ans = new ArrayList<>();
        for(String st:c1){
            ans.add("h"+st);
        }
        for(String st:r1){
            ans.add("v"+st);
        }
        return ans;
    }

}
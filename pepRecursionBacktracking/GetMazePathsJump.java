package pepRecursionBacktracking;

import java.util.*;

public class GetMazePathsJump {

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
        if(sr == dr && sc == dc){
            ArrayList<String> ar = new ArrayList<>();
            ar.add("");
            return ar;
        }
        ArrayList<String> ans = new ArrayList<>();
        
        for(int ms = 1;ms<=dc-sc;ms++){
            ArrayList<String> hpath = getMazePaths(sr, sc+ms, dr, dc);
            for(String st:hpath){
                ans.add("h"+ms+st);
            }
        }
        for(int ms = 1;ms<=dr-sr;ms++){
            ArrayList<String> vpath = getMazePaths(sr+ms, sc, dr, dc);
            for(String st:vpath){
                ans.add("v"+ms+st);
            }
        }
        for(int ms = 1;ms<=dc-sc && ms<=dr-sr;ms++){
            ArrayList<String> dpath = getMazePaths(sr+ms, sc+ms, dr, dc);
            for(String st:dpath){
                ans.add("d"+ms+st);
            }
        }
        return ans;
    }

}
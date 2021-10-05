// no. of ways to jump from given step to ground
//give that you can 1 2 or 3 step at one time

package pepRecursionBacktracking;

import java.util.*;

public class GetStairsPath {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList < String > getStairPaths(int n) {
        if(n==0){
            ArrayList<String> ar = new ArrayList<>();
            ar.add("");
            return ar;
        }else if(n<0){
            ArrayList<String> ar = new ArrayList<>();
            return ar;
        }
        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);
        
        ArrayList<String> paths = new ArrayList<>();
        
        for(String st:path1){
            paths.add(1+st);
        }
        for(String st:path2){
            paths.add(2+st);
        }
        for(String st:path3){
            paths.add(3+st);
        }
        return paths;
    }

}

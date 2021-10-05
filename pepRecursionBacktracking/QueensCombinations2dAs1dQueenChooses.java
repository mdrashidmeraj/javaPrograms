package pepRecursionBacktracking;
import java.io.*;
import java.util.*;


public class QueensCombinations2dAs1dQueenChooses {
    public static void queensCombinations(int qpsf, int tq, boolean[][] chess, int lcno) {
	        // write your code here
	        if(qpsf == tq){
	            for(int r = 0;r<chess.length;r++){
	                for(int c = 0;c<chess[r].length;c++){
	                    if(chess[r][c] == true) System.out.print("q\t");
	                    else System.out.print("-\t");
	                }
	                System.out.println();
	            }
	            System.out.println();
	            return;
	        }
	        
	        for(int cell = lcno+1; cell<chess.length*chess.length; cell++){
	            
	            int i = cell/chess.length;
	            int j = cell%chess.length;
	            
	            chess[i][j] = true;
	            queensCombinations(qpsf+1, tq, chess, cell);
	            
	            chess[i][j] = false;
	        }
	        
	    }

	    public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        boolean[][] chess = new boolean[n][n];

	        queensCombinations(0, n, chess, -1);
	    }
	
}

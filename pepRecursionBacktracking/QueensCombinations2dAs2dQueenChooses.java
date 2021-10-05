package pepRecursionBacktracking;
import java.io.*;
import java.util.*;

public class QueensCombinations2dAs2dQueenChooses {

	    public static void queensCombinations(int qpsf, int tq, boolean[][] chess, int i, int j){
	     
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
	       

	        for(int col = j+1;col<chess.length;col++){
	            chess[i][col] = true;
	            queensCombinations(qpsf+1, tq, chess, i,col);
	            chess[i][col] = false;
	        }
	        
	        for(int row = i+1; row<chess.length; row++){
	            for(int col = 0;col<chess[i].length;col++){
	                chess[row][col] = true;
	                queensCombinations(qpsf+1, tq, chess, row,col);
	                chess[row][col] = false;
	            }
	        }
	 
	    }
	    public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        boolean[][] chess = new boolean[n][n];
	        
	        queensCombinations(0, n, chess, 0, -1);
	    }
	
}

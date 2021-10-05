package backtracking;

import java.util.Scanner;

public class Ratmaze {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int[][] solarr = new int[n][n];
		for(int i =0;i<n;i++)
			for(int j = 0;j<n;j++)
				arr[i][j] = sc.nextInt();
		if(RatInMaze(arr,0,0,n,solarr)) {
			for(int i =0;i<n;i++) {
				for(int j = 0;j<n;j++)
					System.out.print(solarr[i][j]);
				System.out.println();
			}			
		}
	}

	private static boolean RatInMaze(int[][] maze, int x, int y,int n, int[][] solArr) {
		if(x == n-1 && y == n-1) {
			solArr[x][y] =1;
			return true;
		}
		if(maze[x][y] != 0) {
			solArr[x][y] = 1;
			if(RatInMaze(maze,x,y+1,n,solArr)) {
				return true;
			}
			if(RatInMaze(maze,x+1,y,n,solArr)){
				return true;
			}
			solArr[x][y] = 0;
			return false;
		}
		return false;
	}
}

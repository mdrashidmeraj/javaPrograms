package backtracking;

public class ShortestPathMaze {

	public static void main(String[] args) {
		int a[][] = 
			{
					{1,1,1,1,1,0,0,1,1,1},
					{0,1,1,1,1,1,0,1,0,1},
					{0,0,1,0,1,1,1,0,0,1},
					{1,0,1,1,1,0,1,1,0,1},
					{0,0,0,1,0,0,0,1,0,1},
					{1,0,1,1,1,0,0,1,1,0},
					{0,0,0,0,1,0,0,1,0,1},
					{0,1,1,1,1,1,1,1,0,0},
					{1,1,1,1,1,0,0,1,1,1},
					{0,0,1,0,0,1,1,0,0,1},
			};
		int result  = shortestpath(a,0,0,8,0);
		if(result<10000)
		System.out.println(result);
		else System.out.println("no path");

	}
	static int shortestpath(int a[][],int i,int j,int x, int y) {
		int rows= a.length;
		int cols = a[0].length;
		boolean vis[][] = new boolean[rows][cols];
		return shortestpath(a,i,j,x,y,vis);
	}
	static boolean isValid(int a[][],int i,int j,boolean vis[][]) {
		int rows = a.length;
		int cols = a[0].length;
		return i>=0 && j>=0 && i<rows &&j<cols && a[i][j] ==1 && !vis[i][j]; 
	}
	static int shortestpath(int a[][],int i,int j,int x,int y,boolean vis[][]) {
		if(!isValid(a,i,j,vis)) return 10000;
		if(i==x && j==y) return 0;
		vis[i][j] = true;
		int left = shortestpath(a,i,j-1,x,y,vis)+1;
		int right = shortestpath(a,i,j+1,x,y,vis)+1;
		int top = shortestpath(a,i+1,j,x,y,vis)+1;
		int bottom = shortestpath(a,i-1,j,x,y,vis)+1;
		vis[i][j] = false;// this line maks backtracking
		return Math.min(Math.min(left, right), Math.min(top, bottom));
	}

}

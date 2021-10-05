package advanceRecursion;

public class FloodFill {

	public static void main(String[] args) {
		int a[][] = { {1,1,1,2,1,1,1},
					  {2,2,1,2,2,1,1},
					  {0,2,2,2,1,1,1},
					  {1,1,0,2,1,2,2},
					  {1,1,2,2,1,0,0},
					};
		floodfill(a,2,3,3,2);
		for(int i = 0;i<5;i++) {
			for(int j=0;j<7;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void floodfill(int a[][],int r,int c,int tofill,int prevfill) {
		int rows = a.length;
		int cols = a[0].length;
		if(r<0 || r>=rows || c<0 ||c>=cols) {
			return;
		}
		if(a[r][c]!=prevfill) {
			return;
		}
		a[r][c] = tofill;
		floodfill(a,r+1,c,tofill,prevfill);
		floodfill(a,r-1,c,tofill,prevfill);
		floodfill(a,r,c+1,tofill,prevfill);
		floodfill(a,r,c-1,tofill,prevfill);
	}
}

package pepRecursionBacktracking;
import java.util.*;

public class Permutation1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
	
		
		solution(new int[n], 1, k);
		

	}
	public static void solution(int[] arr, int cn,int tn){
		if(cn>tn) {
			for(int i = 0;i<arr.length;i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
			return;
		}
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == 0) {
				arr[i] = cn;
				solution(arr, cn+1, tn);
				arr[i] = 0;
			}
		}
	}

}

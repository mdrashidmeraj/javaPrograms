package pepRecursionBacktracking;
import java.util.*;

public class JosephusProblem {
	
	public static int solution(int n, int k) {
        if (n == 1)
            return 0;
        int ans = solution(n - 1, k);

        return (ans + k) % n;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.println(solution(n, k));
	}

}

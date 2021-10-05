package datatype;
import java.util.Scanner;

public class reverseWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int i = line.length()-1;
		String ans="";
		while(i>=0) {
			while(i>=0 && line.charAt(i)==' ')i--;
			int j = i;
			if(i<0) break;
			while(i>=0 && line.charAt(i) !=' ')i--;
			if(ans.isEmpty()) {
				ans = ans.concat(line.substring(i+1,j+1));
			}else {
				ans = ans.concat(" "+line.substring(i+1, j+1));
			}
		}
		System.out.println(ans);
		sc.close();
	}

}

package interview;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		String substr=sc.nextLine();
		boolean isanagram =true;
		int al[]=new int[256];
		for(char ch: str.toCharArray()) {
			int index = (int)ch;
			al[index]++;
		}
		for(char ch: substr.toCharArray()) {
			int index = (int)ch;
			al[index]--;
		}
		for(int i=0;i<256;i++) {
			if(al[i]!=0) {
				isanagram = false;
				break;
			}
		}
				
		if(isanagram) {
			System.out.println("anagram");
	}else {
		System.out.println("not");
	}
		sc.close();
}

}


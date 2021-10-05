package advanceRecursion;
import java.util.HashSet;
import java.util.Set;
public class STringPermutation {
	static Set<String> set = new HashSet<>();
	public static void main(String[] args) {
		
		String str = "RASHID";
		permutation(str,0,str.length()-1);
	}
	static void permutation(String str,int l,int r) {
		if(l==r){
			if(set.contains(str)) return;
			set.add(str);
			System.out.println(str);
			return;
		}
		for(int i = l;i<=r;i++) {
			str = interchangechar(str, l, i);
			permutation(str,l+1,r);
			str = interchangechar(str,l,i);
		}
	}
	static String interchangechar(String s,int a, int b) {
		char arr[] = s.toCharArray();
		char temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		return String.valueOf(arr);
	}
}

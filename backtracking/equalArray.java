package backtracking;

import java.util.ArrayList;

public class equalArray {

	public static void main(String[] args) {
		int a[] = {2,3,1,7,4,2,1};	
		int result = sum(a,0,a.length-1);	
		ArrayList<Integer> ans = new ArrayList<>();
		boolean isPossible = (result&1) ==0 && 	partition(a,result/2,0,ans);
		if(isPossible) {
			for(int e:ans) {
				System.out.println(e+ " ");
			}
		}else {
			System.out.println("Not Possible");
		}
		
	}
	static int sum(int a[], int l,int r) {
		if(l>r) return 0;
		return a[l]+sum(a,l+1,r);
	}
	static boolean partition(int a[],int sum,int i, ArrayList<Integer> ans)  {
		if(i>a.length || sum<0) return false;
		if(sum==0) return true;
		ans.add(a[i]);
		boolean leftPossible = partition(a,sum-a[i],i+1,ans);
		if(leftPossible) return true;
		ans.remove(ans.size()-1);
		return partition(a,sum,i+1,ans);
	}

}

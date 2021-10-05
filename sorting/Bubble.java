package sorting;
import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array");
		int n = sc.nextInt();
		int[] arr = new int[50];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int temp;
		boolean sorted =true;
		for(int j=0;j<n-1;j++) {
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				sorted =false;
			}
		}
		if (sorted) break;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");		
			}
		}
}


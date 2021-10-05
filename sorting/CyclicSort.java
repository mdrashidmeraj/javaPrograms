package sorting;
import java.util.*;

public class CyclicSort {
	public static void main(String[] args) {
		int[] arr = {3,5,2,1,4};
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void cyclicSort(int[] arr){
		int i =0;
		while(i<arr.length){
		   int correct = arr[i]-1;
		   if(arr[i] != arr[correct]){
		       swap(arr, i, arr[i]-1);
		   }else{
		       i++;
		    }
		}
	}
	static void swap(int[] arr, int i1, int i2){
		    int temp = arr[i1];
		    arr[i1] = arr[i2];
		    arr[i2] = temp;
	} 
	
}

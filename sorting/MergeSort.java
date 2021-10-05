package sorting;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {3,6,8,9,10,2,4,7};
		mergeSort(arr,0,arr.length-1);
		for(int i =0;i<arr.length;i++) System.out.print(arr[i]+" ");
	}

	private static void mergeSort(int[] arr, int l, int r) {
		if(l<r) {
			int mid = (l+r)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			
			merge(arr,l,mid,r);
		}
		
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		
		int n1 = mid-l+1;
		int n2 = r-mid;
		int[] a1 = new int[n1];
		int[] a2 = new int[n2];
		for(int i =0;i<n1;i++) {
			a1[i] = arr[l+i];
		}
		for(int i = 0;i<n2;i++) {
			a2[i] = arr[mid+1+i];
		}
		int i =0;
		int j =0;
		int k =l;
		while(i<n1 && j<n2) {
			if(a1[i]<a2[j]) {
				arr[k] = a1[i];
				k++;i++;
			}
			else {
				arr[k] = a2[j];
				k++;j++;
			}
		}
		while(i<n1) {
			arr[k] = a1[i];
			k++;i++;
		}
		while(j<n2) {
			arr[k] = a2[j];
			k++;j++;
		}
		
	}
}

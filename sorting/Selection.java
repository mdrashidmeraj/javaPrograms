package sorting;
public class Selection {

	public static void main(String[] args) {
		int arr[]= {3,7,1,6,4,8,2,9,5};
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int min = i;
			for(int j=i;j<n;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
				int temp = arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
			for(int e: arr) {
				System.out.print(e+" ");
			}
		}
	}


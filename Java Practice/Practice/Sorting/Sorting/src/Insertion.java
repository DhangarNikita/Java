
public class Insertion {
	static void insertionSort(int arr[]) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int j=i;
			while(j>0&& arr[j]<arr[j-1]) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
	}
	
	
	public static void main(String[]args) {
		int a[]= {50,40,30,20,10};
		insertionSort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}

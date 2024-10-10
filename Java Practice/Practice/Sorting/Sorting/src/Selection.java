
public class Selection {
	static void selectionSort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min_inx=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_inx]) {
					min_inx=j;
				}
			}
			
			int temp=arr[i];
			arr[i]=arr[min_inx];
			arr[min_inx]=temp;
		}
	}
	
	public static void main(String[]args) {
		int a[]= {5,9,7,2,3,6,7};
		selectionSort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}

// given an integer
public class Example_1 {
	static void bubbleSort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]==0&&arr[j+1]!=0) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String[]args) {
		int a[]= {0,5,0,3,42};
		bubbleSort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}


}


public class BubbleSort {
	
	static void bubble(int[]a) {
		int n= a.length;
		for(int i=0;i<n-1;i++) {
			boolean flag=false;
			for(int j=0; j<n-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=true;
					
				}
			}
			if(flag==false) {
				return;
			}
		}
	}
	
	public static void main(String[] args) {
	int[] a= {5,3,6,7,8};
	bubble(a);
	for(int i:a) {
		System.out.println(i+" ");
	}

	}

}

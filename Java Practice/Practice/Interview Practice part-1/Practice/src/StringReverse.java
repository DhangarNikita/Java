
public class StringReverse {
	public static void main(String[]arrg) {
		String str ="ABCD";
		String rev=" ";
		System.out.println(str);
		int n =str.length();
//method 1
  /*
		for(int i=n-1; i>=0;i--){
			rev = rev+str.charAt(i);	
     	}
		System.out.println(rev);
		
 */
//method 2
		/*
		char[] a=str.toCharArray();
		for(int i=a.length-1; i>=0;i--){
			rev = rev+a[i];	
	    }
		System.out.println(rev);
		*/
//method 3
		
		StringBuffer sb =new StringBuffer(str);
		System.out.println(sb.reverse());

	    }
        }

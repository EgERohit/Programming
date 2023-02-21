//WAP to display array element whose digit sum is equal to 5.


package Practiseprogramming;

public class L5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {14,50,64,32,23};
		
		
		for (int i = 0; i < a.length; i++) {
			int n=a[i];
			int sum=0;
			while(n!=0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
			
		}
			if(sum==5) {

				System.out.print(a[i] +" ");
			}
		
		

	}
	}
}

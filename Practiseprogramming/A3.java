package Practiseprogramming;

import java.util.Iterator;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,2,3,5,7,8,4,10};
		int sum1=0;
		int sum2=0;
		
		int n=a.length+1;
		sum1=n*(n+1)/2;
		for (int i = 0; i < a.length; i++) {
			sum2=sum2+a[i];
			
		}
		System.out.println(sum1-sum2);

	}
	

}

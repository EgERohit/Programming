//Missing integer in an array

package Practiseprogramming;

public class L4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {6,3,1,4,5};
		int sum1=0;
		int sum2=0;
		
		int n=a.length +1;
		sum1=n*(n+1)/2;
		
		for (int i = 0; i < a.length; i++) {
			sum2=sum2+a[i];
			
		}
			System.out.println(sum1-sum2);
	}

}

//(Note:- Its only valid if the arrays are in continues order and starting should be from 1)

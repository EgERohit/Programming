//WAp to display sum of all factors of no.



package Allbasicprogramming;

public class R8 {
	


	public static void main(String[] args) {
		int n=6;
		int sum=0;
		
		for(int i=1;i<=n;i++){
			if(n%i==0) {
				sum=sum+i;
			}
			System.out.println(sum);
		}
	
	}
}

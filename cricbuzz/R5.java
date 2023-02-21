package cricbuzz;

public class R5 {

	public static void main(String[] args) {
		
		int n=855;
		int sum=0;
		
		while(n!=0 || sum>=10) {
			if(n==0) {
				n=sum;
				sum=0;
			}
			int d=n%10;
			sum=sum+d;
			n=n/10;
	
		}
		System.out.println(sum);
	}
}

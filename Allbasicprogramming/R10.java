//Wap to check wheteher the number is prime number or not in the range of 1-50



package Allbasicprogramming;

public class R10 {

	public static void main(String[] args) {
		for(int n=1;n<50;n++) {
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println(n+"Prime number");
		}

	}

}
}

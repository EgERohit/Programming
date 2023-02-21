//WAP to interchange the position on first name and sirname.



package String_programms;

public class P5 {

	public static void main(String[] args) {
		
		String s = "ROHIT JADHAV";
		String []a= s.split(" ");
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+ " ");
		}
	}

}

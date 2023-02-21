//Wap to reverse the string without changing their position 

//1st way



package String_programms;

public class P7 {

	public static void main(String[] args) {
		String s="ROHIT JADHAV";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		String[]a=rev.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+ " ");
		}
	}

}

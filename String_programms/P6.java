//Wap to reverse the string without changing their position 

//2nd way



package String_programms;

public class P6 {

	public static void main(String[] args) {
		
		
		String s = "ROHIT JADHAV";
		String []a= s.split(" ");
		
		for(int i=0;i<a.length;i++)
		{
			String rev="";
			for(int j=a[i].length()-1;j>=0;j--)
			{
				rev=rev+a[i].charAt(j);
			}
			
			System.out.print(rev+ " ");
		}
	}

}

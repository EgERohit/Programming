//Wap to reverse the string without changing their position 

package Practiseprogramming;

public class L13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "ROHIT JADHAV";
		String[]a=s.split(" ");
		
		for(int i=0;i<a.length;i++) {
			String rev="";
			for(int j=a[i].length()-1;j>=0;j--) {
				rev=rev+a[i].charAt(j);
			}
			System.out.print(rev+" ");
		}

		}
	}


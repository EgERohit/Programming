package String_programms;

public class P11 {

	public static void sort(char[] c) {
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++) {
			if(c[i]>c[j])
			{
				char temp= c[i];
				c[i]=c[j];
				c[j]=temp;
			}
		}

	}
}




public static void main(String[] args) {
	
	String s1="cat";
	String s2="act";
	if(s1.length()==s2.length()) {
		char[] c1 = s1.toCharArray();
	    char[] c2 = s2.toCharArray();
	    sort(c1);
		sort(c2);
		boolean b =true;
		for(int i=0;i< c2.length;i++) {
			if(c1[i]!=c2[i]) {
				b=false;
				break;
			}
		}
		if(b==true) {
			System.out.println("String is an anagram");
		}
		else {
			System.out.println("String is not an anagram");
		}
	}
	else {
		System.out.println("Not an anagram");
	}
}
}



package StringBuffer_Programms;

public class P1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Jspiders");
		sb.append("thane");
		System.out.println(sb);
		
		sb.insert(8, ' ');
		System.out.println(sb);
		
		sb.delete(9, 14);
		System.out.println(sb);
		
		sb.replace(0, 1, "q");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		

	}

}

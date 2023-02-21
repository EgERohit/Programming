package cricbuzz;

class emp{
	int id;
	String name;
	
	emp(int id,String name)
	{
		super();
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		return"";
	}
	public class company extends Object{
		public static void mian(String[]args) {
			emp details=new emp(10,"Sheela");
			System.out.println("details");
			
			emp details2=new emp(20,"leela");
			System.out.println(details2);
			

		}
	}
	
	}


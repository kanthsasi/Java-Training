package practice.java;

public class this_key {
	String myname;
	
	void setname(String myname)
	{
		this.myname=myname;
	}

	public static void main(String[] args) {
		
		this_key obj1=new this_key();
		obj1.setname("Sasikanth");
		System.out.println(obj1.myname);
		

	}

}

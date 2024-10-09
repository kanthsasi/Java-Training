package practice.java;

class Counters{
	static int count=0;
	int instancenum=0;
	
	Counters()
	{
		count=count+1;
		instancenum=instancenum+1;
	}
	
	void counter()
	{
		System.out.println(count);
		System.out.println(instancenum);
	}
}

public class Staticexample {
	public static void main(String args[])
{
		Counters c1=new Counters();
		c1.counter();
		Counters c2=new Counters();
		c2.counter();
		Counters c3=new Counters();
		c3.counter();
	}
	
}

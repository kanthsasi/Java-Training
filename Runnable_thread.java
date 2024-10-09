package practice.java;

class runnable_ implements Runnable{
	int count=0;
	public void run()
	{
		while(count<50)
		{
			//count=count+1;
			System.out.println(count);
			count=count+1;
		}
		
	}
	
}


public class Runnable_thread {

	public static void main(String[] args) {
		Runnable r1=new runnable_();
		Thread t1=new Thread(r1);
		t1.start();

	}

}

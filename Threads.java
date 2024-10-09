package practice.java;
class Apple extends Thread{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
		System.out.println("HI");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			
			System.out.println(e);
		}
		}
	}
}

class Apple_ extends Thread{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
		System.out.println("HI SASIKANTH");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			
		System.out.println(e);
		}
		}
	}
}

public class Threads {

	public static void main(String[] args) {
		Apple a1=new Apple();
		Apple_ a2=new Apple_();
		a1.setPriority(10);
		a2.setPriority(2);
		a1.start();
		a2.start();

	}

}

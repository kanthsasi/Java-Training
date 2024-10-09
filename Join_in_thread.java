package practice.java;

class join_in_threads extends Thread{
	int j=0;
	public void run(){
		for(int i=1;i<=50;i++)
		{
			j=i;
			System.out.println(j);
		}
	}
}

public class Join_in_thread {

	public static void main(String[] args) {
		join_in_threads j1=new join_in_threads();
		j1.start();
		try {
			j1.join();
		} catch (InterruptedException e) {
		   System.out.println(e);
		}
		System.out.println(j1.j);
	}

}

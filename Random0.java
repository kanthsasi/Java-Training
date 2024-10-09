package practice.java;

import java.util.Random;

public class Random0 {

	public static void main(String[] args) {
		Random rand=new Random();
		int newnum=0;
		while(newnum!=5)
		{
			newnum=rand.nextInt(19);
			System.out.println(newnum);
		}
		

	}

}

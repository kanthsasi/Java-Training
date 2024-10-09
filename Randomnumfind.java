package practice.java;

import java.util.Random;

public class Randomnumfind {

	public static void main(String[] args) {
		Random rand=new Random();
		int newnum=0;
		while(newnum!=8)
		{
			newnum=rand.nextInt(11);
			System.out.println(newnum);
		}

	}

}

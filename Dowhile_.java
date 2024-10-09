package practice.java;

import java.util.Scanner;

public class Dowhile_ {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int count=0;
	do {
		System.out.println("ENTER THE NUMBER>10: ");
		 count=scan.nextInt();
	}
	while(count<10);
	
	

	}

}

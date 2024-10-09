package practice.java;

import java.util.Scanner;

public class boolean0 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean kfc=scan.nextBoolean();
		boolean chicken=scan.nextBoolean();
		boolean pepsi=scan.nextBoolean();
		if(kfc==true)
		{
			System.out.println("enter into kfc");
			if(chicken==true)
			{
				System.out.println("eat the chicken");
				if(pepsi==true)
				{
					System.out.println("drink the pepsi");
				}
			}
		}
		
	}

}

package practice.java;

public class Find_the_prime_numbers_in_a_range {

	public static void main(String[] args) {
		int a=7;
		int b=67;
		int count=0;
		for(int i=a;i<=b;i=i+1)
		{
			if(i%2==0)
			{
				System.out.println(i);
				count=count+1;
			}
		}
		System.out.println(count);
	}

}

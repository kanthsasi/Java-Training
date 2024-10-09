package practice.java;

import java.util.Arrays;

public class Min_Max {

	public static void main(String[] args) {
		int[]arr= {3,7,1,4,6,2,5};
		int min=Arrays.stream(arr).min().getAsInt();
		System.out.println(min);
		int max=Arrays.stream(arr).max().getAsInt();
		System.out.println(max);
		
		

	}

}
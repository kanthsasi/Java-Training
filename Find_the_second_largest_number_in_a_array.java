package practice.java;

import java.util.Arrays;

public class Find_the_second_largest_number_in_a_array {

	public static void main(String[] args) {
		int[] num= {1,35,67,89,45,100,3456};
		Arrays.sort(num);
		//For find largest number in a array.
		//System.out.println(num[num.length-1]);
		//For find second largest number in a array.
		System.out.println(Arrays.toString(num));
		System.out.println(num[num.length-2]);
	}

}

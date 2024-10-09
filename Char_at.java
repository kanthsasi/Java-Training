package practice.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Char_at {

	private static Collectors collectors;

	public static void main(String[] args) {
List<Integer> listofnumbers=
Arrays.asList(1,2,3,4,5,6,7);
 String str="I am Sasikanth";
 String result=
 Arrays.asList(
 str.split(" ")).stream().filter(i->i.length()>2).map(i->String.valueOf(i.charAt(3))).collect(collectors.joining(","));
 System.out.println(result);
		

	}

}

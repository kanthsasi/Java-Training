package practice.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_ {

	public static void main(String[] args) {
		//List<String> names= Arrays.asList("john","jack","jane");
		//Stream<String> stream=names.stream();
		//System.out.println(names);
		List<String> names= Arrays.asList("john","jack","jane","sasi");
		List<String> filteredNames=names.stream().filter(name ->
		name.startsWith("j")).collect(Collectors.toList());
		System.out.println(filteredNames);
	}

}

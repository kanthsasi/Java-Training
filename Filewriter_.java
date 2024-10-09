package practice.java;

import java.io.FileWriter;
import java.io.BufferedWriter;

public class Filewriter_ {

	public static void main(String[] args) {
		try {
		FileWriter fw=new FileWriter("output.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("I am Sasi Kanth");
		bw.newLine();
		bw.write("I have knowledge in python,java,my sql,ms sql,basics in httml,css");
		bw.close();
		System.out.println("Print successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
			
		

	}

	
}

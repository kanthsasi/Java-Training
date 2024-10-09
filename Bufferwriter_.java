package practice.java;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Bufferwriter_ {

	public static void main(String[] args) {
		try {
			BufferedWriter bw=new BufferedWriter("output_.txt");
			bw.write("I am SasiKanth");
			bw.newLine();
			bw.write("I have an knowledge in Python,Java,MY SQL,MS SQL,Basics in HTTML,CSS");
			bw.close();
			System.out.println("Saved successfully");
		}
		catch(Exception e ) {
			System.out.println(e);
		}
		

	}

}

package practice.java;
import java.io.FileReader;
import java.io.BufferedReader;

public class Filereader2 {

	public static void main(String[] args) {
		try {
	FileReader fr=new FileReader("filereader.txt");
	BufferedReader br=new BufferedReader(fr);
	String line=br.readLine();
	while(line!=null)
	{
	System.out.println(line);
	line=br.readLine();
	}

	br.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}


package practice.java;
import java.io.FileReader;

public class Filereader1 {

	public static void main(String[] args) {
		try {
	FileReader fr=new FileReader("filereader.txt");
	int c=fr.read();
	while(c!=-1)
	{
	System.out.print(c);
	c=fr.read();
	}

	fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}


package practice.java;

interface playable{
	void play();
}
class guitar implements playable{
	public void play()
	{
		System.out.println("Play guitar");
	}
}

class piano implements playable{
	public void play()
	{
		System.out.println("Play piano");
	}
}

public class Interface1 {

	public static void main(String[] args) {
		piano p1=new piano();
		p1.play();

	}

}

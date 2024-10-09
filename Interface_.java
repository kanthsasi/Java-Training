package practice.java;
//defaulty abstract method will apply
//abstract na ella subclass um super class erukiradha potu aganum like void sound() erukuna ella sub class um adha conform include panniya aganum.
//int,string ku ellam default ha final key word set agi erukum
//final means adha final adha change panna mudiyadhu
//final method na example edha void method la pota adha final like adhae dha ella subclass kum varum include the value(void sound()
//{
//sysout("anything")
//}
//final class-oru class final ha erukuna adha inherit panna mudiyadhu.
interface vilungal{
	void sound();
	int mark=20;
}

class punaigal implements vilungal{
	 public void sound()
	{
		System.out.println("meow......");
	}
}
public class Interface_ {

	public static void main(String[] args) {
		punaigal p1=new punaigal();
		p1.sound();
	    System.out.println(p1.mark);
		

	}

}

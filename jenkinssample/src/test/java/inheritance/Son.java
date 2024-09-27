package inheritance;

public class Son extends Father
{
	public void SonDisplay()
	{
		System.out.println("son method displayed");
	}
	

	public static void main(String[] args) 
	{
		Son ob=new Son();
		ob.grandDisplay();
		ob.fatherDisplay();
		ob.SonDisplay();
		Daughter ob1=new Daughter();
		ob1.DaughterDisplay();
		
	}

}

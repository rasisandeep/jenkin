package inheritance;

public class ConstructorPgm 
{
public ConstructorPgm ()
{
	System.out.println("first constructor");
}
public ConstructorPgm (int a)
{
	this();
	System.out.println("value of a:" +a);
}
	public static void main(String[] args) 
	{
		ConstructorPgm ob=new ConstructorPgm (23);
	}

}

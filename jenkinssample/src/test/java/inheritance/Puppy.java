package inheritance;

public class Puppy extends Dog
{
public void show()
{
System.out.println("child class puppy is displayed");
}

public static void main(String[] args)
{
Puppy ob=new Puppy();
ob.show();
ob.display();
ob.type();

	}

}

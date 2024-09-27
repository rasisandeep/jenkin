package inheritance;

public class Developer extends Employee
{
String desgn="developer";
public void show()
{
	System.out.println("developeer clas displayed");
}
	public static void main(String[] args) 
	{
		Developer ob = new Developer();

		System.out.println("class name:" +ob.name);
		ob.display();

		System.out.println("designation:"+ob.desgn);
		ob.show();
Tester obj=new Tester();
obj.testerDisplay();
	}

}

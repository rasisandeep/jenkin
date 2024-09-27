package inheritance;

public class Car extends SingleInhrtnc
{
	String model="SUV";
	public void display()
	{
		System.out.println("adventure model");
	}

	public static void main(String[] args) 
	{
		Car c=new Car(); //object should be created to child class
c.details();
c.display();
System.out.println("speed:"+c.speed);	
System.out.println("model:"+c.model);	

	}

}

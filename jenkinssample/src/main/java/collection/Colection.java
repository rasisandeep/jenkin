package collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class Colection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list1=new ArrayList();
list1.add("Ram");
list1.add("12");
System.out.println(list1);
System.out.println(list1.size());
System.out.println(list1.isEmpty());
System.out.println("NON GENERIC");
ArrayList l1=new ArrayList();
l1.add("ram");
l1.add(11);

System.out.println("Contains Method");
System.out.println(l1.contains("12"));
System.out.println("l1");

System.out.println("GENERIC");
ArrayList<String>l2=new ArrayList<String>();
l2.add("ram");
l2.add("23");
l2.add("ram");
System.out.println("l2");
System.out.println("Iterator");

Iterator<String>it= l2.iterator();
while(it.hasNext())
{
System.out.println(it.next());

}
it.remove();
l2.add(null);
l2.add(null);
l2.add(null);
l2.remove(2);
l2.add(2,"rasi");
System.out.println("l2");
for(int i=0;i<l2.size();i++)
{
	System.out.println(l2.get(i));
}
System.out.println("foreach loop");
for(String i:l2) 
{
System.out.println(i);
}



	}
}

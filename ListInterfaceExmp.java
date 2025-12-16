import java.util.*;
public class ListInterfaceExmp
{
	public static void main(String x[])
	{
		LinkedList al = new LinkedList();
		al.add(10);
		al.add(20);
		al.add(30);
		
		// forward direction accessing elements
		ListIterator li = al.listIterator();
		while(li.hasNext())
		{
			Object obj = li.next();
			System.out.println(obj);
		}
		System.out.println("Printing list in reverse order");
		// reverse direction accessing elements
		ListIterator fow = al.listIterator(al.size());
		while(fow.hasPrevious())
		{
			Object obj = fow.previous();
			System.out.println(obj);
		}
	}
}
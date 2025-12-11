/*
Q3. Take an ArrayList of integers, convert it to a Vector, then sort the Vector in ascending order manually (without using Collections.sort).
What you practice:
ArrayList → Vector conversion
Manual sorting (bubble sort / selection sort)
Vector methods like add(), get(), set()
*/
import java.util.*;
public class ArrayListConverstion
{
	public static void main(String x[])
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(40);
		al.add(90);
		al.add(80);
		System.out.println("Array List elements are: "+al);
		
		// converting array list into vector
		Vector v = new Vector(al);
		System.out.println("Vector Elements: "+v);
		System.out.println("Accessing objects of the Vector using for loop");
		for(int i = 0; i < al.size() - 1; i++)
		{
			for(int j = i+1; j < al.size(); j++)
			{
				Object obj = v.get(i); // acceessing i'th index value
				int first = (int)obj; // converting objects into integer number
				obj = v.get(j); // acceessing j'th index value 
				int last = (int)obj; // converting objects into integer number
				if(first > last) // checking integer value
				{
					first = first + last;
					last = first - last;
					first = first - last;
				}
				// after swapping setting the values into there positions
				v.set(i,first); 
				v.set(j,last);
			}
		}
		// printing sorted vector
		System.out.println("Vector after sorting: "+v);
	}
}
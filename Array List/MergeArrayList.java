/*
Q2. Create two ArrayLists containing integers. Merge them into a new ArrayList but avoid adding repeated numbers.
What you practice:
Merging lists
Checking for duplicates (contains)
Building logical flow to avoid sets
*/
import java.util.*;
public class MergeArrayList
{
	public static void main(String x[])
	{
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		System.out.println(a1);
		ArrayList a2 = new ArrayList();
		a2.add(10);
		a2.add(50);
		a2.add(90);
		a2.add(30);
		System.out.println(a2);
		ArrayList result = new ArrayList();
		for(Object l : a1)
		{
			result = a1;
		}
		for(Object l : a2)
		{
			int a12 = (int)l;
			if(!(result.contains(a12)))
			{
				result.add(l);
			}
		}
		System.out.println(result);
	}
}
/*
Q4. Take an integer array with repeated values. Store it in an ArrayList and print the frequency of each unique number.
What you practice:
Traversing ArrayList
Using another ArrayList to track visited elements
Logical counting
*/
import java.util.*;
public class FreqNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.print("Enter the total values insert into array list: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			System.out.print("Enter the "+i+" value: ");
			int num = sc.nextInt();
			al.add(num);
		}
		System.out.println("The values in Arraylist is: "+al);
		
		ArrayList newAl = new ArrayList();
		// find out unique values and store into new ArrayList
		for(int i = 0; i < al.size(); i++)
		{
			if(!(newAl.contains(al.get(i))))
			{
				newAl.add(al.get(i));
			}
		}
		System.out.println(newAl);
		for(int i= 0; i < newAl.size(); i++)
		{
			int count = 0;
			for(int j = 0; j < al.size(); j++)
			{
				if(al.get(j) == newAl.get(i))
					count++;
			}
			if(count > 0)
			{
				System.out.println("Frequencey of "+newAl.get(i)+" is: "+count);
			}
		}
	}
}
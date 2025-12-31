/*
Q1. Create an ArrayList of integers. Add 5 numbers and display all elements using a loop.
Explanation:
	This helps you understand:
How to declare an ArrayList
How to add elements using add()
How to traverse an ArrayList using for loop
*/
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListDisplay
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.print("Enter the size of array list: ");
		int size = sc.nextInt();
		System.out.print("Enter the values in array list: ");
		for(int i = 0; i < size; i++)
		{
			al.add(sc.nextInt());
		}
		System.out.print("Elements in ArrayList: ");
		for(int i = 0; i < al.size(); i++)
		{
			System.out.print(" "+al.get(i));
		}
		System.out.println();
		System.out.print("Data Fetch using for-each loop: ");
		// other way
		for(Object o: al)
		{
			System.out.print(" "+o);
		}
	}
}
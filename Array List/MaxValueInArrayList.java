/*
Q3. Write a program to find the maximum value from an integer ArrayList.
Explanation:
 You will learn:
How to compare elements
Store maximum value manually
Logical thinking without built-in methods
*/
import java.util.Scanner;
import java.util.ArrayList;
public class MaxValueInArrayList
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total size of array list: ");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter the values into array list: ");
		for(int i = 1; i <= size; i++)
		{
			al.add(sc.nextInt());
		}
		int max = al.get(0);
		for(Integer obj: al)
		{
			if(obj > max)
			{
				max = obj;
			}
		}
		System.out.println("Max Value is: "+max);
		
	}
}
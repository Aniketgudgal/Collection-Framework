/*
Q2. Create an ArrayList of integers and calculate the sum of all elements.

	Explanation:
	 This question practices:
Iterating over ArrayList
Performing arithmetic operations
Using get(index) method
*/
import java.util.Scanner;
import java.util.ArrayList;
public class SumOfAllElements
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.print("Enter the total size of array list: ");
		int size = sc.nextInt();
		System.out.print("Enter the values in array list: ");
		for(int i = 0; i < size; i++)
		{
			al.add(sc.nextInt());
		}
		int sum = 0;
		for(Object obj: al)
		{
			int num = (int)obj;
			sum += num;
		}
		System.out.println("The Sum of All Element is: "+sum);
	}
}
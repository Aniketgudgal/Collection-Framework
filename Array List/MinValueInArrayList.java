/*
Q4. Create an ArrayList and find the minimum element.
Explanation:
 Similar to max logic, this improves:
Conditional checking
Traversal logic
*/
import java.util.Scanner;
import java.util.ArrayList;
public class MinValueInArrayList
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total size of array list: ");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter the values in ArrayList: ");
		for(int i = 0; i < size; i++)
		{
			al.add(sc.nextInt());
		}
		int min = al.get(0);
		for(Integer obj: al)
		{
			if(obj < min)
			{
				min = obj;
			}
		}
		System.out.print("The minimum value is: "+min);
	}
}
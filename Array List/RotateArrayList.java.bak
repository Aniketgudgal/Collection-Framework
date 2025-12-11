/*
Q7. Given an ArrayList and a value k, rotate the list to the right by k positions:
 Example: [1,2,3,4,5], k=2 → [3,4,5,1,2]
What you practice:
Modular arithmetic
Using temporary lists
Index manipulation
*/
import java.util.*;
public class RotateArrayList
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.print("Enter the total elements: ");
		int n = sc.nextInt();
		System.out.print("Enter the value: ");
		for(int i= 1; i <= n; i++)
		{
			int num = sc.nextInt();
			al.add(num);
		}
		System.out.println(al);
		System.out.print("Enter the value of k: ");
		int k = sc.nextInt();
		ArrayList temp = new ArrayList();
		for(int i = k; i < al.size(); i++)
		{
			temp.add(al.get(i));
		}
		for(int i = 0; i < k; i++)
		{
			temp.add(al.get(i));
		}
		System.out.print(temp);
	}
}
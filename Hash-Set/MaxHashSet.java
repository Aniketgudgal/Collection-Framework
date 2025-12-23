import java.util.HashSet;
import java.util.Scanner;
// finding max from hash set class collection
public class MaxHashSet
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the values store into hash set: ");
		int size = sc.nextInt();
		HashSet hs = new HashSet();
		System.out.print("Enter the value: ");
		while(size != 0)
		{
			int input = sc.nextInt();
			hs.add(input);
			size --;
		}
		// finding max value
		int max = 0;
		for(Object obj: hs)
		{
			int num = (int)obj;
			if(num > max)
			{
				max = num;
			}
		}
		System.out.println("The max value is: "+max );
		// display hash set
		System.out.print("hash set store objects are: ");
		for(Object obj:hs)
		{
			System.out.print(obj+ " ");
		}
	}
}
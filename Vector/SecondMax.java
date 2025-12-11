/*
Q5. Take an integer array, store it in a Vector, and determine the second largest number without sorting.
What you practice:
Max/second-max tracking
Using Vector get() method
Efficient single-pass logic
*/
import java.util.*;
public class SecondMax
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int nums[] = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		
		// copy values from array to vector
		Vector vr = new Vector();
		for(int i = 0; i < nums.length; i++)
		{
			vr.add(nums[i]);
		}
		System.out.println(vr);
		int max = 0, secondMax = 0;
		for(int i = 0; i < vr.size(); i++)
		{
			if((int)vr.get(i) > max)
			{
				secondMax = max;
				max = (int)vr.get(i);
			}
			if((int)vr.get(i) > secondMax && (int)vr.get(i) < max)
			{
				secondMax = (int)vr.get(i);
			}
		}
		System.out.println("The max is: "+max);
		System.out.println("The second max is: "+secondMax);
	}
}
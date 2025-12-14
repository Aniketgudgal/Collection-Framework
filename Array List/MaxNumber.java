import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MaxNumber
{
	public static void main(String x[])
	{
		List c = new ArrayList();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		System.out.println(c);
		int maxValue = (int)Collections.max(c);
		System.out.println("The max number is: "+maxValue);
	}
}
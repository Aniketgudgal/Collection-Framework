/*
program to check the default value of vector
*/
import java.util.Vector;
public class VectorCapacityCheck
{
	public static void main(String x[])
	{
		Vector v = new Vector(); // creating the vector class Object
		int capacity = v.capacity(); // check the value of object with capacity() method, this method return the capacity of vector
		System.out.println("The Default value of vector is: "+capacity);
	}
}
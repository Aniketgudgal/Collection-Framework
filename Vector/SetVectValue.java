/*
set default increment value shrink value with vector class Constructor
*/
import java.util.Vector;
public class SetVectValue
{
	public static void main(String x[])
	{
		Vector v = new Vector(2,2); // first parameter is size and second is shrink
		System.out.println("Default capacity is: "+v.capacity());
		System.out.println("size is: "+v.size());
		System.out.println("default value store in vector: "+v);
		v.add(10);
		v.add(20);
		v.add(30);
		System.out.println("Default capacity is: "+v.capacity());
		System.out.println("Size is: "+v.size());
		System.out.println(v);
	}
}
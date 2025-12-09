import java.util.Vector; // import class
import java.util.List; // import interface
public class CheckSize
{
	public static void main(String x[])
	{
		List l = new Vector(); // using upcasting to check the size of the vector
		System.out.println("Check empty condition: "+l.isEmpty());
		l.add(200);
		int size = l.size();
		System.out.println("The size of Vector is: "+size);
		System.out.println("Check empty condition: "+l.isEmpty());
	}
}
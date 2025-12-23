import java.util.HashSet;
public class HashSetImplement
{
	public static void main(String x[])
	{
		HashSet s = new HashSet();
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(500);
		s.add(600);
		for(Object obj: s)
		{
			System.out.println(obj);
		}
	}
}
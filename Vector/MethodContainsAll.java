import java.util.*;
public class MethodContainsAll
{
	public static void main(String x[])
	{
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.addLast("yd");
		v.addFirst(true);
		v.add(0.001f);
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(30);
		a.add(60);
		a.add("aniket");
		System.out.println(v);
		System.out.println(a);
		Vector vl = new Vector();
		vl.add(10);
		vl.add(40);
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		System.out.println(al.removeAll(vl));
		System.out.println(vl);
		System.out.println(al);
	}
}
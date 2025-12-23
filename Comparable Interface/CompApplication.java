import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Employee implements Comparable
{
	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	public int getSalary()
	{
		return salary;
	}
	public int compareTo(Object o)
	{
		Employee e = (Employee)o;
		if(this.id > e.id)
		{
			return 1;
		}
		else if(this.id < e.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
public class CompApplication
{
	public static void main(String x[])
	{
		Employee e1 = new Employee(1,"Aniket",5000);
		Employee e2 = new Employee(2,"Gokul",4000);
		Employee e3 = new Employee(3,"Omkar",6000);
		List s = new ArrayList();
		s.add(e2);
		s.add(e1);
		s.add(e3);
		for(Object obj:s)
		{
			Employee e = (Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName() +"\t"+e.getSalary());
		}
		System.out.println();
		Collections.sort(s);
		System.out.println("After Sorting");
		for(Object obj:s)
		{
			Employee e = (Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
		}
	}
}
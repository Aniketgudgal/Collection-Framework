import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
class Employee implements Comparable
{
	private int id;
	private String name;
	private int salary;
	public Employee()
	{
	}
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
	public int compareTo(Object obj)
	{
		Employee e = (Employee)obj;
		return (this.salary > e.salary) ? 1 : (this.salary == e.salary) ? 0: -1;  
	}
	public String toString()
	{
			return (id + "\t"+name+"\t"+salary);
	}
}
public class MaxSalEmp
{
	public static void main(String x[])
	{
		Employee e1 = new Employee(1,"ABC",1500);
		Employee e2 = new Employee(2,"PQR",3000);
		Employee e3 = new Employee(3,"MCS",1000);
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println("Before Sorting");
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		Collections.sort(list);
		System.out.println("After the sorting");
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}
}
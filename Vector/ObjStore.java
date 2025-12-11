/*
Storing the Object in vector
*/
import java.util.*;
class Employee
{
	private int id;
	private String name;
	private int salary;
	Employee(int id, String name, int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getSalary()
	{
		return salary;
	}
}
public class ObjStore
{
	public static void main(String x[])
	{
		Vector vt = new Vector();
		Employee e1 = new Employee(1,"Aniket",4000); // creating objects of the Employee class 
		Employee e2 = new Employee(2,"yd",5000);
		Employee e3 = new Employee(3,"gb",6000);
		vt.add(e1); // adding this objects into vector class
		vt.add(e2);
		vt.add(e3);
		Iterator i = vt.iterator(); // iterating one by one
		while(i.hasNext()) // checking the next object is present in array or not
		{
			Object obj = i.next(); // accessing the object
			Employee e = (Employee)obj; // converting this object into class reference
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary()); // printing each values of object
		}
	}
}
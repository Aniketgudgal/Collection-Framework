import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
class Student
{
	private int id;
	private String name;
	private int marks;
	
	public Student()
	{
	}
	public Student(int id, String name, int marks)
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
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
	public void setMarks(int marks)
	{
		this.marks = marks;
	}
	public int getMarks()
	{
		return marks;
	}
	public String toString()
	{
		return (id+"\t"+name+"\t"+marks);
	}
}
 class SortById implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Student s1 = (Student)obj1;
		Student s2 = (Student)obj2;
		return s1.getId() > s2.getId() ? 1: s1.getId() == s2.getId() ? 0: -1;
	}
	
}
class SortByName implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Student s1 = (Student)obj1;
		Student s2 = (Student)obj2;
		return s1.getName().compareTo(s2.getName());
	}
}
class SortByMarks implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Student s1 = (Student)obj1;
		Student s2 = (Student)obj2;
		return s1.getMarks() < s2.getMarks() ? 1 : s1.getMarks() == s2.getMarks() ? 0 : -1;
	}
	
}
public class StudentMainApplication
{
	public static void main(String x[])
	{
		Student s1 = new Student(4,"ABC",100);
		Student s3 = new Student(3,"CSQ",50);
		Student s2 = new Student(2,"MCS",80);
		Student s4 = new Student(1,"ORW",40);
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s3);
		list.add(s2);
		list.add(s4);
		System.out.println("Before Sort");
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		// sort id
		SortById sid = new SortById();
		System.out.println("After sorting id");
		Collections.sort(list,sid);
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		//sort by name
		SortByName  sn = new SortByName();
		Collections.sort(list,sn);
		System.out.println("Sorting data using Name");
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		//sort marks
		SortByMarks mk = new SortByMarks();
		Collections.sort(list,mk);
		System.out.println("After Sorting marks");
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}
}
/*
Min Stack
Description:
Design a stack that can return the minimum element at any time in constant time.
Explanation:
Track minimum values along with elements so you can always retrieve the smallest efficiently.
Example:
Operations → push(3), push(1), push(2)
Minimum → 1
*/
import java.util.Scanner;
class StackMin<E extends Comparable<E>>
{
	Object[] arr;
	Object[] minArr;
	int top = -1;
	int minTop = -1;

	
	public StackMin(int size)
	{
		arr = new Object[size];
		minArr = new Object[size];
	}
	public StackMin()
	{
		this(5);
	}
	public void add(E e)
	{
		if(top < arr.length - 1)
		{
			arr[++top] = e;
		    if (minTop == -1 || e.compareTo((E)minArr[minTop]) <= 0) 
			{
                minArr[++minTop] = e;
			}
		}
		else
		{
			System.out.println("Stack is OverFlow");
		}
	}
	public E peek()
	{
		return (E)arr[top];
	}
	public E pop()
	{
		 if (top == -1) {
            System.out.println("Stack Empty");
            return null;
        }

        E removed = (E) arr[top--];

        if (removed.equals(minArr[minTop])) {
            minTop--;
        }

        return removed;
	}
	public int size()
	{
		return top+1;
	}
	public E getMin() {
        if (minTop == -1) return null;
        return (E) minArr[minTop];
    }
	public void showData()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
			return;
		}
		for(int i = top; i >= 0; i--)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
public class MinStack
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		StackMin<Integer> al = new StackMin<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.showData();
		System.out.println(al.getMin());
		System.out.println("Top is: "+al.peek());
		al.pop();
		System.out.println(al.getMin());
		System.out.println("Top after operation is: "+al.peek());
		System.out.println("Size of stack is: "+al.size());
		al.add(40);
		al.add(60);
		al.add(70);
		al.showData();
	}
}
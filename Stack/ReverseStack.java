import java.util.Stack;
public class ReverseStack
{
	public static void main(String x[])
	{
		Stack<Integer> st = new Stack<>();
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		System.out.println(st);
		reverseStack(st);
		System.out.println(st);
	}
	public static void reverseStack(Stack<Integer> arr)
	{
		if(arr.isEmpty())
		{
			return ;
		}
		int top = arr.pop();
		reverseStack(arr);
		insertBottom(arr,top);
	}
	public static void insertBottom(Stack<Integer> st, int element)
	{
		if(st.isEmpty())
		{
			st.push(element);
			return;
		}
		int top = st.pop();
		insertBottom(st, element);
		st.push(top);
		
	}
}
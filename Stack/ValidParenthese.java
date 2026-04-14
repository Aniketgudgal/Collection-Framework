/*
Valid Parentheses
Description:
You are given a string containing brackets (), {}, []. You must check whether every opening bracket
has a correct closing bracket in the correct order.
Explanation:
Use stack logic:
 Push opening brackets
 Pop when matching closing bracket appears
Example:
Input → "()[]{}"
Output → true
Input → "(]"
Output → false
*/
import java.util.Scanner;
import java.util.Stack;
public class ValidParenthese
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input: ");
		String inp = sc.next();
		Stack<Character> st = new Stack<>();
		boolean flag = true;
		for(int i = 0; i < inp.length(); i++)
		{
			if(inp.charAt(i) == '{' || inp.charAt(i) == '[' || inp.charAt(i) == '(')
			{
				st.push(inp.charAt(i));
			}
			else
			{
				if(!inp.isEmpty())
				{
					if((inp.charAt(i) == '}' && st.peek() == '{') || (inp.charAt(i) == ']' && st.peek() == '[') || (inp.charAt(i) == ')' && st.peek() == '('))
					{
						st.pop();
					}
					else
					{
						flag = false;
						System.out.println("Invalid Parentheses");
						break;
					}
				}
				else
				{
					flag = false;
					System.out.println("Invalid Parentheses");
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println("Valid Parentheses");
		}
	}
}
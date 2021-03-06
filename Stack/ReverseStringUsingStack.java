import java.util.*;

class ReverseStringUsingStack
{
	public static String reverse(String s)
	{
		Stack<Character> stack = new Stack<>();
		char[] a = s.toCharArray();
		for(char c : a)
		{
			stack.push(c);
		}
		for(int i=0;i<s.length();i++)
		{
			a[i] = stack.pop();
		}
		return new String(a);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		System.out.print("Reversed string : "+reverse(str));
	}
}

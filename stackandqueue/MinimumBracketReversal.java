package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class MinimumBracketReversal {
	public static int minimumBracketReversal(String s) {
		if(s.length()%2!=0)
			return -1;
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='}'&&!st.isEmpty()) {
				if(st.peek()=='{') {
					st.pop();
				}
				else
				{
					st.push(ch);
				}
			}
			else
			{
				st.push(ch);
			}
		}
			int red=st.size();
			int n=0;
			while(!st.isEmpty()) {
				st.pop();
				n++;
			}
		return (red/2)+n%2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(minimumBracketReversal(s));

	}

}

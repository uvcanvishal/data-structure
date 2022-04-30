package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class RedundantBrackets {
	public static boolean redundantBrackets(String s) {
		Stack<Character> st=new Stack<>();
		int n=s.length();
		for(int i=0;i<n;i++) {
			char x=s.charAt(i);
			if(x=='('||x=='+'||x=='-'||x=='*'||x=='/') {
				st.push(s.charAt(i));
			}
			else if(x==')') 
			{
				boolean isRedundant=true;
				while(st.peek()!='(') 
				{
				 char k=st.peek();
				 if(k=='+'||k=='-'||k=='*'||k=='/') 
				 {
					isRedundant=false;
				 }
				 st.pop();
				}
				st.pop();
				if(isRedundant==true)
					return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(redundantBrackets(s));

	}

}

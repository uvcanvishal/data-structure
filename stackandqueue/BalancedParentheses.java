package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
	public static boolean balancedParantheses(String s) {
		Stack<Character> stack=new Stack<>();
		System.out.println(s.length());
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
			char c=s.charAt(i);
			if(c=='('||c=='['||c=='{') {
				stack.push(c);
			}
			if(stack.isEmpty())
				return false;
			char k;
			if(c==')') {
					k=stack.pop();
					if(k=='['||k=='{')
						return false;
			}else if(c==']') {
					k=stack.pop();
					if(k=='{'||k=='(')	
						return false;
			}else if(c=='}') {
					k=stack.pop();
					System.out.println(k);
					if(k=='('||k=='[')
						return false;
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(balancedParantheses(s));
	}

}

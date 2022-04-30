package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
	public static void transfer(Stack<Integer> s1,Stack<Integer> s2,int n) {
		for(int i=0;i<n;i++) {
			s2.push(s1.pop());
		}
	}
	public static void reverseStack(Stack<Integer> s1,int n) {
		Stack<Integer> s2=new Stack<Integer>();
		for(int i=0;i<n;i++) {
			int x=s1.pop();
			transfer(s1,s2,n-i-1);
			s1.push(x);
			transfer(s2,s1,n-i-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Stack<Integer> s1=new Stack<Integer>();
		for(int i=0;i<n;i++) {
			s1.push(i+1);
		}
		reverseStack(s1,n);
		while(!s1.isEmpty())
		{
			System.out.println(s1.pop());
		}
	}

}

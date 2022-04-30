package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
	public static void stockSpan(int price[],int n,int s[]) {
		Stack<Integer> st=new Stack<>();
		st.push(0);
		s[0]=1;
		for(int i=1;i<n;i++) {
			while((!st.isEmpty())&&(price[st.peek()]<price[i])) {
				st.pop();
			}
			s[i]=(st.isEmpty())?(i+1):(i-st.peek());
			st.push(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int price[]=new int[n];
		for(int i=0;i<n;i++) {
			price[i]=sc.nextInt();
		}
		int s[]=new int[n];
		stockSpan(price,n,s);
		for(int i=0;i<n;i++) {
			System.out.println(s[i]);
		}

	}

}

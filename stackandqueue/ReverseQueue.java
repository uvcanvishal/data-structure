package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseQueue {
	public static void reverseQueue(Queue<Integer> q) {
		if(q.isEmpty())
			return;
		int x=q.poll();
		reverseQueue(q);
		q.add(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Queue<Integer> q=new LinkedList<>();
		for(int i=0;i<n;i++) {
			q.add(i+1);
		}
		reverseQueue(q);
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}

	}

}

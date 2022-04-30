package graph;

import java.util.Scanner;

public class BFS {
	private static void printBfs(int edges[][],int sv,boolean visited[]) {
		QueueUsingLL<Integer> q=new QueueUsingLL<>();
		q.enqueue(sv);
		visited[sv]=true;
		int n=edges.length;
		while(!q.isEmpty()) {
			int front=0;
			try {
				front = q.dequeue();
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(front);
			for(int i=0;i<n;i++) {
				if(edges[front][i]==1 && !visited[i]) {
					q.enqueue(i);
					visited[i]=true;
				}
			}
		}
	}
	public static void printBfs(int edges[][]) {
		boolean visited[]=new boolean[edges.length];
		for(int i=0;i<edges.length;i++) {
			if(!visited[i])
				printBfs(edges,i,visited);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		int edges[][]=new int[v][v];
		for(int i=0;i<e;i++) {
			int sv=sc.nextInt();
			int ev=sc.nextInt();
			edges[sv][ev]=1;
			edges[ev][sv]=1;
		}
		printBfs(edges);
	}

}


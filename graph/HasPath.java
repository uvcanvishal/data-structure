package graph;

import java.util.Scanner;

public class HasPath {
	private static boolean hasPath(int edges[][],boolean visited[],int v1,int v2) {
		QueueUsingLL<Integer> q=new QueueUsingLL<>();
		q.enqueue(v1);
		visited[v1]=true;
		int n=edges.length;
		while(!q.isEmpty()) {
			int front=0;
			try {
				front = q.dequeue();
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println(front);
			for(int i=0;i<n;i++) {
				if(edges[front][i]==1 && !visited[i]) {
					q.enqueue(i);
					visited[i]=true;
				}
			}
		}
		if(visited[v2]==true)
			return true;
		else
			return false;
	}
	public static boolean hasPath(int edges[][],int v1,int v2) {
		boolean visited[]=new boolean[edges.length];
		return hasPath(edges,visited,v1,v2);
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
		int v1=sc.nextInt();
		int v2=sc.nextInt();
		boolean ans=hasPath(edges,v1,v2);
		System.out.println(ans);
	}

}


package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GetPathBfs {
	private static ArrayList<Integer> getPathBfs(int edges[][],boolean visited[],int v1,int v2) {
		if(v1==v2)
		{
			ArrayList<Integer> ans=new ArrayList<>();
			ans.add(v1);
			visited[v1]=true;
			return ans;
		}
		HashMap<Integer, Integer> h=new HashMap<>();
		QueueUsingLL<Integer> q=new QueueUsingLL<>();
		ArrayList<Integer> ans=new ArrayList<>();
		q.enqueue(v1);
		visited[v1]=true;
		int n=edges.length;
		while(!q.isEmpty()) 
		{
			int front=0;
			try {
				front = q.dequeue();
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i=0;i<n;i++)
			{
				if(edges[front][i]==1 && !visited[i]) 
				{
					q.enqueue(i);
					visited[i]=true;
					h.put(i, front);
					if(i==v2)
					{
						ans.add(i);
						while(!ans.contains(v1))
						{
							int b=h.get(i);
							ans.add(b);
							i=b;
						}
						return ans;
					}
				}
			}
		}
		return null;
	}
	public static void getPathBfs(int edges[][],int v1,int v2) {
		boolean visited[]=new boolean[edges.length];
				ArrayList<Integer> arr=getPathBfs(edges,visited,v1,v2);
				if(arr!=null) {
					for(int elem:arr)
						System.out.print(elem+" ");
				}
				else {
					System.out.println("no such path");
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
		int v1=sc.nextInt();
		int v2=sc.nextInt();
		getPathBfs(edges,v1,v2);
	}

}

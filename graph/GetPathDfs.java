package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class GetPathDfs {
	private static ArrayList<Integer> getPathDfs(int edges[][],boolean visited[],int v1,int v2) {
		if(v1==v2)
		{
			ArrayList<Integer> ans=new ArrayList<>();
			ans.add(v1);
			visited[v1]=true;
			return ans;
		}
		visited[v1]=true;
		for(int i=0;i<edges.length;i++) {
			if(edges[v1][i]==1 && !visited[i]) {
				ArrayList<Integer> ans=getPathDfs(edges,visited,i,v2);
				if(ans!=null) {
					ans.add(v1);
					return ans;
				}
			}
		}
		return null;
	}
	public static void getPathDfs(int edges[][],int v1,int v2) {
		boolean visited[]=new boolean[edges.length];
				ArrayList<Integer> arr=getPathDfs(edges,visited,v1,v2);
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
		getPathDfs(edges,v1,v2);
	}

}

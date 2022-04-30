package graph;

import java.util.Scanner;

public class DFS {
	private static void printDfs(int edges[][],int sv,boolean visited[]) {
		System.out.println(sv);
		visited[sv]=true;
		for(int i=0;i<edges.length;i++) {
			if(edges[sv][i]==1 && !visited[i])
				printDfs(edges, i, visited);
		}
	}
	public static void printDfs(int edges[][]) {
		boolean visited[]=new boolean[edges.length];
		for(int i=0;i<edges.length;i++) {
			if(!visited[i])
				printDfs(edges,i,visited);
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
		printDfs(edges);
	}

}

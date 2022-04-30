package graph;

import java.util.Scanner;

public class PrimsAlgorithm {
	public static int findMinVertex(int weight[],boolean visited[]) {
		int minVertex=-1;
		for(int i=0;i<weight.length;i++)
			if(!visited[i] && (minVertex==-1 || weight[i]<weight[minVertex]))
				minVertex=i;
		return minVertex;
	}
	public static void prims(int adjacency[][]) {
		int v=adjacency.length;
		boolean visited[]=new boolean[v];
		int weight[]=new int[v];
		int parent[]=new int[v];
		parent[0]=-1;
		weight[0]=0;
		for(int i=1;i<v;i++) {
			weight[i]=Integer.MAX_VALUE;
		}
		for(int i=0;i<v;i++) {
			int minVertex=findMinVertex(weight,visited);
			visited[minVertex]=true;
			for(int j=0;j<v;j++) {
				if(adjacency[minVertex][j]!=0 && !visited[j]) {
					if(adjacency[minVertex][j]<weight[j]) {
						weight[j]=adjacency[minVertex][j];
						parent[j]=minVertex;
					}
				}
			}
		}
		for(int i=1;i<v;i++) {
			if(i<parent[i])
				System.out.println(i+" "+parent[i]+" "+weight[i]);
			else
				System.out.println(parent[i]+" "+i+" "+weight[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		int adjacency[][]=new int[v][v];
		for(int i=0;i<e;i++) {
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			int weight=sc.nextInt();
			adjacency[v1][v2]=weight;
			adjacency[v2][v1]=weight;
		}
		prims(adjacency);
	}

}

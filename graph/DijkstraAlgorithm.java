package graph;

import java.util.Scanner;

public class DijkstraAlgorithm {
	public static int findMinVertex(int distance[],boolean visited[]) {
		int minVertex=-1;
		for(int i=0;i<distance.length;i++) {
			if(!visited[i] && (minVertex==-1 || distance[i]<distance[minVertex]))
				minVertex=i;
		}
		return minVertex;
	}
	public static void dijkstra(int adjacency[][]) {
		int v=adjacency.length;
		boolean visited[]=new boolean[v];
		int distance[]=new int[v];
		distance[0]=0;
		for(int i=1;i<v;i++) {
			distance[i]=Integer.MAX_VALUE;
		}
		for(int i=0;i<v-1;i++) {
			int minVertex=findMinVertex(distance,visited);
			visited[minVertex]=true;
			for(int j=0;j<v;j++) {
				if(adjacency[minVertex][j]!=0 && !visited[j]) {
					int newDist=adjacency[minVertex][j]+distance[minVertex];
					if(newDist<distance[j])
						distance[j]=newDist;
				}
			}
		}
		for(int i=0;i<v;i++) {
			System.out.println(i+" "+distance[i]);
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
		dijkstra(adjacency);
	}

}

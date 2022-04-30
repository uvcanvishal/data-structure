package graph;


import java.util.ArrayList;
import java.util.Scanner;

public class AllConnectedComponents {
	private static void allComponents(int edges[][],int sv,boolean visited[],ArrayList<Integer> ans) {
		ans.add(sv);
		visited[sv]=true;
		for(int i=0;i<edges.length;i++) {
			if(edges[sv][i]==1 && !visited[i])
				allComponents(edges, i, visited,ans);
		}
	}
	public static void allComponents(int edges[][]) {
		boolean visited[]=new boolean[edges.length];
		for(int i=0;i<edges.length;i++) {
			if(!visited[i])
			{
				ArrayList<Integer> arr=new ArrayList<>();
				allComponents(edges,i,visited,arr);
				for(int j=0;j<arr.size();j++) {
					System.out.print(arr.get(j)+" ");
					
				}
				System.out.println();
			}
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
		allComponents(edges);
	}

}

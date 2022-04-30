package graph;

import java.util.Arrays;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
	int source;
	int dest;
	int weight;
	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		return this.weight-o.weight;
	}
}
public class KruskalsAlgorithm {
	public static int findParent(int v,int parent[]) {
		if(v==parent[v])
			return v;
		return findParent(parent[v], parent);
	}
	public static void kruskals(Edge input[],int n) {
		Arrays.sort(input);
		Edge output[]=new Edge[n-1];
		int parent[]=new int[n];
		for(int i=0;i<n;i++)
			parent[i]=i;
		int count=0;
		int i=0;
		while(count!=n-1) {
			Edge currentEdge=input[i];
			int sourceParent=findParent(currentEdge.source,parent);
			int destParent=findParent(currentEdge.dest,parent);
			if(sourceParent!=destParent) {
				output[count]=currentEdge;
				count++;
				parent[sourceParent]=destParent;
			}
			i++;
		}
		for(int j=0;j<n-1;j++) {
			if(output[j].source<output[j].dest)
				System.out.println(output[j].source+" "+output[j].dest+" "+output[j].weight);
			else
				System.out.println(output[j].dest+" "+output[j].source+" "+output[j].weight);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int e=sc.nextInt();
		Edge input[]=new Edge[e];
		for(int i=0;i<e;i++) {
			input[i]=new Edge();
			input[i].source=sc.nextInt();
			input[i].dest=sc.nextInt();
			input[i].weight=sc.nextInt();
		}
		kruskals(input,n);
	}

}

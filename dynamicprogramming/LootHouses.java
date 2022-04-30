package dynamicprogramming;

import java.util.Scanner;

public class LootHouses {
	public static int lootHouses(int arr[],int n) {
		if(n<=0)
			return 0;
		
		int select=arr[n-1]+lootHouses(arr,n-2);
		int notselect=lootHouses(arr,n-1);
		return Math.max(select, notselect);
	}
	private static int lootHousesM(int arr[],int n,int storage[]) {
		if(n<=0)
			return 0;
		if(storage[n-1]!=-1)
			return storage[n-1];
		int select=arr[n-1]+lootHouses(arr,n-2);
		int notselect=lootHouses(arr,n-1);
		storage[n-1]=Math.max(select, notselect);
		return storage[n-1];
	}
	public static int lootHousesM(int arr[],int n) {
		int storage[]=new int[n];
		for(int i=0;i<n;i++) {
			storage[i]=-1;
		}
		return lootHousesM(arr, n,storage);
	}
	public static int lootHousesDP(int arr[]) {
		int n=arr.length;
		int storage[]=new int[n];
		storage[0]=arr[0];
		storage[1]=Math.max(arr[1], storage[0]);
		for(int i=2;i<n;i++) {
			storage[i]=Math.max(storage[i-1], arr[i]+storage[i-2]);
		}
		return storage[n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(lootHousesDP(arr));
		System.out.println(lootHousesM(arr,n));
		System.out.println(lootHouses(arr,n));
	}

}

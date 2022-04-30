package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class PairsWithDifferenceK {
	public static void pairsWithDifferenceK(int a[],int k) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i]-k)) {
				System.out.println((a[i]-k)+" "+a[i]);
			}
			if(map.containsKey(a[i]+k)) {
				System.out.println(a[i]+" "+(a[i]+k));
			}
			map.put(a[i],1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		pairsWithDifferenceK(a,k);
	}

}

package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class PrintIntersection {
	public static void printIntersection(int a[],int b[]) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i]))
				map.put(a[i], map.get(a[i])+1);
			else
				map.put(a[i],1);
		}
		for(int i=0;i<b.length;i++) {
			if(map.containsKey(b[i]))
			{
				if(map.get(b[i])!=0)
				{
					System.out.print(b[i]+" ");
					map.put(b[i],map.get(b[i])-1);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array1");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number of elements in array2");
		int m=sc.nextInt();
		int b[]=new int[m];
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		printIntersection(a,b);
	}

}

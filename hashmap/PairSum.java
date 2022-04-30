package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class PairSum {
	public static void pairSum(int a[]) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(-a[i])&&(map.get(-a[i])!=0)) {
				int count=map.get(-a[i]);
				while(count!=0) {
					if(a[i]>0) {
						System.out.println(-a[i]+" "+a[i]);
					}else {
						System.out.println(a[i]+" "+(-a[i]));
					}
					count--;
				}
			}
				if(map.containsKey(a[i])) {
					map.put(a[i], map.get(a[i])+1);
				}else {
					map.put(a[i], 1);
				}
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
		pairSum(a);
	}

}

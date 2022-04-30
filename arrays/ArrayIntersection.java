package arrays;

import java.util.Scanner;

public class ArrayIntersection {
	private static void intersect(int []a,int []b,int n,int m) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+" ");
					b[j]=-b[j];
					j=m;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in 1st array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number of elements in 2nd array");
		int m=sc.nextInt();
		int b[]=new int[m];
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		intersect(a,b,n,m);
	}

}

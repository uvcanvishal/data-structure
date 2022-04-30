package arrays;

import java.util.Scanner;

public class LinearSearch {
	private static int linear(int []a,int x) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				return i;
			}
		}
		return -1;
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
		int x=sc.nextInt();
		System.out.println(linear(a,x));
	}

}

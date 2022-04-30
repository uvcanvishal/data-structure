package arrays;

import java.util.Scanner;

public class ReturnSum {
	private static int sum(int []a) {
		int s=0;
		for(int i=0;i<a.length;i++) {
			s+=a[i];
		}
		return s;
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
		System.out.println(sum(a));
	}

}

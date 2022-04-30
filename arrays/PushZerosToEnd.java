package arrays;

import java.util.Scanner;

public class PushZerosToEnd {
	private static void push(int []a,int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(a[i]!=0) {
				int t=a[count];
				a[count]=a[i];
				a[i]=t;
				count++;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
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
		push(a,n);
	}

}

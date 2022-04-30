package arrays;

import java.util.Scanner;

public class ArrangeNumbers {
	private static void arrange(int []a) {
		int k=1;
		for(int i=1;i<=a.length/2;i++) {
			a[i-1]=k++;
			System.out.println(a[i-1]);
			a[a.length-i]=k++;
		}
		if(a.length%2!=0) {
			a[a.length/2]=k;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in 1st array");
		int n=sc.nextInt();
		int a[]=new int[n];
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
		arrange(a);
	}

}

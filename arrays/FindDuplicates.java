package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicates {
	private static void find3(int []a) {
		int duplicate=0;
		for(int i=0;i<a.length;i++) {
			int element=a[Math.abs(a[i])];
			if(element<0) {
				System.out.println(Math.abs(a[i]));
				break;
			}
			a[Math.abs(a[i])]=-a[Math.abs(a[i])];
		}
	}
	private static void find2(int []a)
	{
		int slow=a[0];
		int fast=a[a[0]];
		while(slow!=fast) {
			slow=a[slow];
			fast=a[a[fast]];
		}
		fast=0;
		while(slow!=fast) {
			slow=a[slow];
			fast=a[fast];
		}
		System.out.println(slow);
	}
	private static void find1(int []a)
	{
		int res=0;
		for(int i=0;i<a.length-2;i++) {
			res=res^i^a[i];
		}
		System.out.println(res^a[a.length-1]);
	}
	private static void find(int []a)
	{
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=i)
			{
				System.out.println(a[i]);
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of testcases");
		t=sc.nextInt();
		while(t!=0) {
			System.out.println("Enter the number of elements");
			n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			find(a);
			find1(a);
			//find2(a);
			find3(a);
			t--;
		}

	}

}

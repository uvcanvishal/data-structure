	package arrays;

import java.util.Scanner;

public class FindUnique {
private static int find(int a[])
{
	int x=a[0];
	for(int i=1;i<a.length;i++)
	{
		x=x^a[i];
	}
	return x;
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
			System.out.println(find(a));
			t--;
		}
		
		

	}

}

package arrays;

import java.util.Scanner;
	
public class Sort012 {
	private static void sort012(int []a,int n) {
		int l=0,m=0,h=n-1,t=0;
		while(m<=h) {
			switch(a[m]) {
			case 0:
			{
				t=a[m];
				a[m]=a[l];
				a[l]=t;
				l++;
				m++;
				System.out.println("hi");
				break;
			}
			case 1:
				m++;
				System.out.println("hello");
				break;
			case 2:
			{
				t=a[h];
				a[h]=a[m];
				a[m]=t;
				h--;
				System.out.println("bye");
				break;
			}
			}
		}
		for(int i=0;i<n;i++)
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
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sort012(a,n);
	}

}

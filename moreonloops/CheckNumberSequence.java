package moreonloops;

import java.util.Scanner;

public class CheckNumberSequence {
	private static void check(int a[],int n) {
		int compareArray[]=new int[n-1];
		for(int i=0;i<n-1;i++)
		{
			compareArray[i]=a[i]-a[i+1];
			if(compareArray[i]==0) {
				System.out.println("false");
				return;
			}
		}
		int count=0;
		for(int i=0;i<n-2;i++) {
			if(compareArray[i]>0 && compareArray[i+1]<0 ||(compareArray[i]<0 && compareArray[i+1]>0))
			{
				count++;
			}
		}
		if(count>=2)
		{
			System.out.println("false");
			return;
		}else
		{
			System.out.println("true");
			return;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;                           
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		check(a,n);

	}

}

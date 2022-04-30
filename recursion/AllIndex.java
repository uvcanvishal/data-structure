package recursion;

import java.util.Scanner;

public class AllIndex {
	private static int[] allIndex(int a[],int x) {
		return allIndex(a,x,0);
	}
	private static int[] allIndex(int a[],int x,int startIndex) {
		if(startIndex==a.length)
		{
			int output[]=new int[0];
			return output;
		}
		int smallOutput[]=allIndex(a,x,startIndex+1);
		if(a[startIndex]==x) {
			int output[]=new int[smallOutput.length+1];
			//output[0]=startIndex;
			for(int i=0;i<smallOutput.length;i++)
			{
				output[i]=smallOutput[i];
			}
			return output;
		}else
		{
			return smallOutput;
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int x=sc.nextInt();
		int k[]=allIndex(a,x);
		for(int i=0;i<k.length;i++)
		{
			System.out.print(k[i]+" ");
		}


	}

}

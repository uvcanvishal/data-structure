package recursion;

import java.util.Scanner;

public class LastIndex {
	private static int lastIndex(int a[],int x) {
		return lastIndex(a,x,0);
	}
	private static int lastIndex(int a[],int x,int startIndex) {
		if(startIndex==a.length)
			return -1;
		int smallOutput=lastIndex(a,x,startIndex+1);
		if(smallOutput!=-1)
			return smallOutput;
		if(a[startIndex]==x)
			return startIndex;
		else
			return -1;
	}
	/*private static int lastIndex(int a[],int x,int size) {
		if(size==-1)
			return -1;
		if(x==a[size])
			return size;
		return lastIndex(a,x,size-1);
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int x=sc.nextInt();
		System.out.println(lastIndex(a,x));


	}

}

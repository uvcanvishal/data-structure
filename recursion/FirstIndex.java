package recursion;

import java.util.Scanner;

public class FirstIndex {
	private static int firstIndex(int a[],int x) {
		return firstIndex(a,x,0);
	}
	private static int firstIndex(int a[],int x,int startIndex) {
		if(a.length==startIndex)
			return -1;
		if(x==a[startIndex])
			return startIndex;
		return firstIndex(a,x,startIndex+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int x=sc.nextInt();
		System.out.println(firstIndex(a,x));


	}

}

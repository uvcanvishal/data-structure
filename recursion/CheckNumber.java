package recursion;

import java.util.Scanner;

public class CheckNumber {
	private static boolean checkNumber(int a[],int x) {
		return check(a,x,0);
	}
	private static boolean check(int a[],int x,int startIndex) {
		if(a.length==startIndex)
			return false;
		if(x==a[startIndex])
			return true;
		return check(a,x,startIndex+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int x=sc.nextInt();
		System.out.println(checkNumber(a,x));


	}

}

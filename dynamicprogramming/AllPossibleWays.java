package dynamicprogramming;

import java.util.Scanner;

public class AllPossibleWays {
	public static int allPossibleWays(int n,int x,int i) {
		int value=(int)(n-Math.pow(i, x));
		if(value<0)
			return 0;
		if(value==0)
			return 1;
		int ans=allPossibleWays(value, x, i+1)+allPossibleWays(n, x, i+1);
		return ans;
	}
	private static int allPossibleWaysM(int n,int x,int i,int storage[]) {
		int value=(int)(n-Math.pow(i, x));
		if(value<0)
			return 0;
		if(value==0)
			return 1;
		if(storage[n]!=-1)
			return storage[n];
		storage[n]=allPossibleWaysM(value, x, i+1,storage)+allPossibleWaysM(n, x, i+1,storage);
		return storage[n];
	}
	public static int allPossibleWaysM(int n,int x,int k)
	{
		int storage[]=new int[n+1];
		for(int i=0;i<=n;i++)
			storage[i]=-1;
		return allPossibleWaysM(n,x,k,storage);
	}
	/*public static int allPossibleWaysDP(int n,int x) {
		int storage[]=new int[n+1];
		int temp=n;
		int j=1;
		for(int i=1;i<=n;i++) {
			int value=(int)(temp-Math.pow(j, x));
			int k=(int)(temp+Math.pow(j-1, x));
			System.out.println(temp+":-"+Math.pow(j, x));
			if(value<0) {
				temp=k;
			}
			else if(value==0) {
				j=i+1;
				temp=value;
				storage[i]=1+storage[i-1];
				System.out.println("hello:"+storage[i]+i);
			}
			else
			{
				j=i+1;
				temp=value;
				storage[i]=storage[i-1];
			}
		}
		return storage[Math.ceil(a)];
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		//System.out.println(allPossibleWaysDP(n,x));
		System.out.println(allPossibleWaysM(n,x,1));
		System.out.println(allPossibleWays(n,x,1));
	}

}

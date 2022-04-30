package dynamicprogramming;

import java.util.Scanner;

public class MinimumSquares {
	public static int getMinSquares(int n) {
		if(n<=3)
			return n;
		int res=n;
		for(int i=1;i<=n;i++) {
			int temp=i*i;
			if(temp>n)
				break;
			else
			{
				res=Math.min(res, 1+getMinSquares(n-temp));
				//System.out.println(res);
			}
		}
		return res;
	}
	private static int getMinSquaresM(int n,int storage[]) {
		if(n<=3)
		{
			storage[n]=n;
			return storage[n];
		}
		if(storage[n]!=0)
			return storage[n];
		int res=n;
		for(int i=1;i<=n;i++) {
			int temp=i*i;
			if(temp>n)
				break;
			else
			{
				res=Math.min(res, 1+getMinSquaresM(n-temp,storage));
				storage[n]=res;
				//System.out.println("top down:"+i+"-"+res);
			}
		}
		return storage[n];
	}
	public static int getMinSquaresM(int n) {
		int storage[]=new int[n+1];
		for(int i=0;i<=n;i++) {
			storage[i]=0;
		}
		return getMinSquaresM(n,storage);
	}
	public static int getMinSquaresDP(int n) {
		int storage[]=new int[n+1];
		storage[0]=0;
		storage[1]=1;
		storage[2]=2;
		storage[3]=3;
		for(int i=4;i<=n;i++) {
			storage[i]=i;
			for(int j=1;j<=Math.ceil(Math.sqrt(i));j++) {
				int temp=j*j;
				if(temp>i)
					break;
				else
					storage[i]=Math.min(storage[i], 1+storage[i-temp]);
			}
		}
		return storage[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(getMinSquaresDP(n));
		System.out.println(getMinSquaresM(n));
		System.out.println(getMinSquares(n));
	}

}

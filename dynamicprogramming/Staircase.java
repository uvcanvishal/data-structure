package dynamicprogramming;

import java.util.Scanner;

public class Staircase {
	public static int staircase(int n) {
		if(n==0)
			return 1;
		else if(n<0)
			return 0;
		else
			return staircase(n-1)+staircase(n-2)+staircase(n-3);
		
	}
	private static int staircaseM(int n,int storage[]) {
		if(n==0) {
			storage[n]=1;
			return storage[n];
		}
		else if(n<0) {
			return 0;
		}
		if(storage[n]!=-1)
			return storage[n];
		storage[n]=staircaseM(n-1,storage)+staircaseM(n-2, storage)+staircaseM(n-3, storage);
		return storage[n];
	}
	public static int staircaseM(int n) {
		int storage[]=new int[n+1];
		for(int i=0;i<=n;i++) {
			storage[i]=-1;
		}
		return staircaseM(n,storage);
	}
	public static int staircaseDP(int n) {
		int storage[]=new int[n+1];
		storage[0]=1;
		storage[1]=1;
		storage[2]=2;
		for(int i=3;i<=n;i++)
			storage[i]=storage[i-1]+storage[i-2]+storage[i-3];
		return storage[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(staircaseDP(n));
		System.out.println(staircaseM(n));
		System.out.println(staircase(n));
	}

}

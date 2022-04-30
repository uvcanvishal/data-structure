package dynamicprogramming;

import java.util.Scanner;

public class NumberOfBalancedBinaryTrees {
	private static int countBalancedBts(int h,int mod) {
		if(h==0||h==1)
			return 1;
		int x=countBalancedBts(h-1);
		int y=countBalancedBts(h-2);
		long res1=(long)x*x;
		long res2=(long)2*x*y;
		int value1=(int)(res1 % mod);
		int value2=(int)(res2 % mod);
		return (value1+value2)%mod;
	}
	public static int countBalancedBts(int h) {
		int mod=(int)Math.pow(10, 9) + 7;
		return countBalancedBts(h,mod);
	}
	private static int countBalancedBtsM(int h,int mod,int storage[]) {
		if(h==0||h==1) {
			storage[h]=1;
			return storage[h];
		}
		if(storage[h]!=-1)
			return storage[h];
		int x=countBalancedBtsM(h-1,mod,storage);
		int y=countBalancedBtsM(h-2,mod,storage);
		long res1=(long)x*x;
		long res2=(long)2*x*y;
		//System.out.println(res1+" "+res2);
		int value1=(int)(res1 % mod);
		int value2=(int)(res2 % mod);
		storage[h]=(value1+value2)%mod;
		return storage[h];
	}
	public static int countBalancedBtsM(int h) {
		int mod=(int)Math.pow(10, 9) + 7;
		int storage[]=new int[h+1];
		for(int i=0;i<=h;i++) {
			storage[i]=-1;
		}
		return countBalancedBtsM(h,mod,storage);
	}
	private static int countBalancedBtsDP(int h,int mod) {
		int storage[]=new int[h+1];
		storage[0]=1;
		storage[1]=1;
		for(int i=2;i<=h;i++) {
			
			storage[i]=(int)((2L*storage[i-1]*storage[i-2])%mod + (1L*storage[i-1]*storage[i-1])%mod)%mod;
		}
		return storage[h];
	}
	public static int countBalancedBtsDP(int h) {
		int mod=(int)Math.pow(10, 9)+7;
		return countBalancedBtsDP(h,mod);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		System.out.println(countBalancedBtsDP(h));
		System.out.println(countBalancedBtsM(h));
		System.out.println(countBalancedBts(h));
	}

}

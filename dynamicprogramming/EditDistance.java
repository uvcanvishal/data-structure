package dynamicprogramming;

import java.util.Scanner;

public class EditDistance {
	public static int editDistance(String s,String t) {
		int m=s.length();
		int n=t.length();
		if(m==0)
			return n;
		if(n==0)
			return m;
		if(s.charAt(0)==t.charAt(0))
			return editDistance(s.substring(1), t.substring(1));
		else
		{
			int op1=editDistance(s, t.substring(1));
			int op2=editDistance(s.substring(1), t);
			int op3=editDistance(s.substring(1), t.substring(1));
			return 1+Math.min(op1, Math.min(op2, op3));
		}
	}
	private static int editDistanceM(String s,String t,int storage[][]) {
		int m=s.length();
		int n=t.length();
		if(storage[m][n]!=-1)
			return storage[m][n];
		if(m==0) {
			storage[0][n]=n;
			return storage[m][n];
		}
		if(n==0) {
			storage[m][0]=m;
			return storage[m][n];
		}
		if(s.charAt(0)==t.charAt(0))
			storage[m][n]= editDistance(s.substring(1), t.substring(1));
		else
		{
			int op1=editDistance(s, t.substring(1));
			int op2=editDistance(s.substring(1), t);
			int op3=editDistance(s.substring(1), t.substring(1));
			storage[m][n]= 1+Math.min(op1, Math.min(op2, op3));
		}
		return storage[m][n];
	}
	public static int editDistanceM(String s,String t) {
		int m=s.length();
		int n=t.length();
		int storage[][]=new int[m+1][n+1];
		for(int k=0;k<=m;k++)
			for(int l=0;l<=n;l++)
				storage[k][l]=-1;
		return editDistanceM(s, t,storage);
	}
	public static int editDistanceDP(String s,String t) {
		int m=s.length();
		int n=t.length();
		int storage[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
			storage[i][0]=i;
		for(int j=0;j<=n;j++)
			storage[0][j]=j;
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(s.charAt(m-i)==t.charAt(n-j))
					storage[i][j]=storage[i-1][j-1];
				else {
					storage[i][j]=1+Math.min(storage[i][j-1], Math.min(storage[i-1][j-1], storage[i-1][j]));
				}
			}
		}
		return storage[m][n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		System.out.println(editDistanceDP(s,t));
		System.out.println(editDistanceM(s,t));
		System.out.println(editDistance(s,t));
	}

}

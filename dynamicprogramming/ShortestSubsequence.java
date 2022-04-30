package dynamicprogramming;

import java.util.Scanner;

public class ShortestSubsequence {
	public static int shortestSubsequence(String s,String t,int m,int n) {
		if(m==0)
			return 1005;
		if(n<=0)
			return 1;
		int k;
		for(k=0;k<n;k++)
			if(t.charAt(k)==s.charAt(0))
				break;
		if(k==n)
			return 1;
		return Math.min(shortestSubsequence(s.substring(1), t, m-1, n),1 + shortestSubsequence(s.substring(1), t.substring(k+1), m-1, n-k-1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		int ans=shortestSubsequence(s,t,s.length(),t.length());
		System.out.println(ans);
				if(ans>=1005)
					ans=-1;
		System.out.println(ans);
	}

}

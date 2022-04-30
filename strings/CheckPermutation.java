package strings;

import java.util.Scanner;

public class CheckPermutation {
	private static boolean checkPermutation(String s1,String s2) {
		if(s1.length()!=s2.length())
			return false;
		int c[]=new int[256];
		for(int i=0;i<256;i++)
			c[i]=0;
		for(int i=0;i<s1.length();i++)
		{
			c[s1.charAt(i)]++;
			c[s2.charAt(i)]--;
		}
		for(int i=0;i<256;i++)
		{
			if(c[i]!=0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(checkPermutation(s1,s2));
	}

}

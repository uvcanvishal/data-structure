package recursion;

import java.util.Scanner;

public class StringToInteger {
	private static int change(String s) {
		if(s.length()==1)
			return s.charAt(0)-'0';
		int smallOutput=change(s.substring(0,s.length()-1));
		int lastDigit=s.charAt(s.length()-1)-'0';
		return smallOutput*10+lastDigit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(change(s));
	}

}

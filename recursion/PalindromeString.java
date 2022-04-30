package recursion;

import java.util.Scanner;

public class PalindromeString {
	private static boolean palindrome(String st,int s,int e) {
		if(s==e)
			return true;
		if(st.charAt(s)!=st.charAt(e))
			return false;
		if(s<e+1)
			return palindrome(st,s+1,e-1);
		return true;
	}
	private static boolean palindrome(String st) {
		if(st.length()==0)
			return true;
		return palindrome(st,0,st.length()-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		System.out.println(palindrome(st));

	}

}

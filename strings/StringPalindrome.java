package strings;

import java.util.Scanner;

public class StringPalindrome {
	private static boolean isPalindrome(String s) {
		int l=0,h=s.length()-1;
		while(l<=h) {
			if(s.charAt(l++)!=s.charAt(h--))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(isPalindrome(s));
	}

}

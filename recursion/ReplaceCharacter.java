package recursion;

import java.util.Scanner;

public class ReplaceCharacter {
	private static String replaceCharacter(String s,char c1,char c2) {
		if(s.length()==0) {
			return "";
		}
		char c;
		if(s.charAt(0)==c1)
			c=c2;
		else
			c=s.charAt(0);
		String ans=replaceCharacter(s.substring(1),c1,c2);
		return c+ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c1=sc.next().charAt(0);
		char c2=sc.next().charAt(0);
		String output=replaceCharacter(s,c1,c2);
		System.out.println(output);
	}

}

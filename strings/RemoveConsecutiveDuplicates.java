package strings;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
	private static void duplicates(StringBuilder s) {
		int i=0,j=0;
		int n=s.length();
		while(j<n) {
			if(s.charAt(i)!=s.charAt(j)) {
				i++;
				s.setCharAt(i,s.charAt(j));
			}
			j++;
		}
		System.out.println(s.substring(0,i+1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuilder str=new StringBuilder(s);
		duplicates(str);
	}

}

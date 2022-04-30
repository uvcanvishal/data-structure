package strings;

import java.util.Scanner;

public class RemoveCharacter {
	private static String removeCharacter(String s,char c) {
		String k="";
		int i=0,n=s.length();
		while(i<n) {
			if(s.charAt(i)!=c) {
				k+=s.charAt(i);
			}
			i++;
		}
		return k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c=sc.next().charAt(0);
		System.out.println(removeCharacter(s,c));
	}

}

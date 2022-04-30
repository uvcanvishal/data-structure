package recursion;

import java.util.Scanner;

public class RemoveDuplicate {
	private static String removeDuplicate(String s) {
		if(s.length()<=1)
			return s;
		if(s.charAt(0)==s.charAt(1))
			return removeDuplicate(s.substring(1));
		else
		{
			String smallans=removeDuplicate(s.substring(1));
			return s.charAt(0)+smallans;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String output=removeDuplicate(s);
		System.out.println(output);

	}

}

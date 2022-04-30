package recursion;

import java.util.Scanner;

public class RemovePi {
	private static String replace(String s) {
		if(s.length()<=1)
			return s;
		else
		{
			if(s.substring(0, 2).equals("pi"))
			{
				String news=s.substring(2);
				s="3.14"+news;
			}
		}
		return s.charAt(0)+replace(s.substring(1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(replace(s));

	}

}

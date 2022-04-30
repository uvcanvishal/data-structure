package recursion;

import java.util.Scanner;

public class RemoveX {
	private static String remove(String s) {
		if(s.length()==0)
			return "";
		if(s.charAt(0)=='x')
			return remove(s.substring(1));
		return s.charAt(0)+remove(s.substring(1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(remove(s));

	}

}

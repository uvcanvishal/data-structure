package recursion;

import java.util.Scanner;

public class PrintPermutation {
	private static void permute(String input,String output) {
		if(input.length()==0)
		{
			System.out.println(output);
			return;
		}
		for(int i=0;i<=output.length();i++) {
			System.out.println(input.charAt(0)+"*"+output+"*");
			permute(input.substring(1),output.substring(0,i)+input.charAt(0)+output.substring(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		permute(s,"");

	}

}

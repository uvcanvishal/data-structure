package recursion;

import java.util.Scanner;

public class ReturnPermutation {
	private static String[] permute(String input) {
		if(input.length()==0)
		{
			String output[]= {""};
			return output;
		}
		String smallOutput[]=permute(input.substring(1));
		String output[]=new String[input.length()*smallOutput.length];
		int k=0;
		for(int i=0;i<smallOutput.length;i++) {
			String s=smallOutput[i];
			for(int j=0;j<=s.length();j++) {
				output[k++]=s.substring(0,j)+input.charAt(0)+s.substring(j);
			}
		}
		return output;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String output[]=permute(s);
		for(String st:output) {
			System.out.println(st);
		}

	}

}

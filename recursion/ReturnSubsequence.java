package recursion;

import java.util.Scanner;

public class ReturnSubsequence {
	private static String[] subsequence(String s) {
		if(s.length()==0) {
			String ans[]= {""};
			return ans;
		}
		String smallans[]=subsequence(s.substring(1));
		String ans[]=new String[2*smallans.length];
		int k=0;
		for(int i=0;i<smallans.length;i++) {
			ans[k]=smallans[i];
			k++;
		}
		for(int i=0;i<smallans.length;i++) {
			ans[k]=s.charAt(0)+smallans[i];
			k++;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		String output[]=subsequence(s);
		for(int i=0;i<output.length;i++) {
			System.out.println(output[i]);
		}

	}

}

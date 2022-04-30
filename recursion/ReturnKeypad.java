package recursion;

import java.util.Scanner;

public class ReturnKeypad {
	private static String[] keydigit(int n) {
		if(n<=1)
		{
			System.exit(0);
		}
		if(n==2) {
			String output[]= {"a","b","c"};
			return output;
		}
		else if(n==3) {
			String output[]= {"d","e","f"};
			return output;
		}
		else if(n==4) {
			String output[]= {"g","h","i"};
			return output;
		}
		else if(n==5) {
			String output[]= {"j","k","l"};
			return output;
		}
		else if(n==6) {
			String output[]= {"m","n","o"};
			return output;
		}
		else if(n==7) {
			String output[]= {"p","q","r","s"};
			return output;
		}
		else if(n==8) {
			String output[]= {"t","u","v"};
			return output;
		}
		else {
			String output[]= {"w","x","y","z"};
			return output;
		}
	}
	private static String[] keypad(int n) {
		if(n==0) {
			String ans[]= {""};
			return ans;
		}
		String smallans[]=keypad(n/10);
		String digit[]=keydigit(n%10);
		String ans[]=new String[smallans.length*digit.length];
		int k=0;
		for(int i=0;i<smallans.length;i++) {
			for(int j=0;j<digit.length;j++) {
				ans[k]=smallans[i]+digit[j];
				k++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String output[]=keypad(n);
		for(int i=0;i<output.length;i++) {
			System.out.println(output[i]);
		}

	}

}

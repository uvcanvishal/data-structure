package recursion;

import java.util.Scanner;

public class PrintKeypad {
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
	private static void keypad(int n,String output) {
		if(n==0) {
			System.out.println(output);
			return;
		}
		String digit[]=keydigit(n%10);
		for(int i=0;i<digit.length;i++) {
			keypad(n/10,digit[i]+output);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		keypad(n,"");
	}

}

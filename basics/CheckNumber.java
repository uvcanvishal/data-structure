package basics;
import java.util.*;
public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		check(n);
		sc.close();
		
	}
	static void check(int n) {
		if(n>0)
			System.out.println("1");
		else if(n<0)
			System.out.println("-1");
		else
			System.out.println("0");
	}

}

package basics;
import java.util.*;
public class SumOfEven {
	private static void sum(int n) {
		int i=2,sum=0;
		while(i<=n) {
			sum+=i;
			i=i+2;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sum(n);

	}

}

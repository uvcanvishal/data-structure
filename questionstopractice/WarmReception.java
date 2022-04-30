package questionstopractice;

import java.util.Arrays;
import java.util.Scanner;

public class WarmReception {
	private static int chairs(int arr[],int dept[],int n) {
		Arrays.sort(arr);
		Arrays.sort(dept);
		int chairs=0,j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<dept[j])
			{
				chairs++;
				continue;
			}
			j++;
		}
		return chairs;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		System.out.println(chairs(a,b,n));

	}

}

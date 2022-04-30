package questionstopractice;

import java.util.Scanner;

public class SubarraySum {
	private static int subarraysum(int arr[],int n) {
		int current_max=arr[0],max_so_far=arr[0];
		for(int i=1;i<n;i++){
			if(arr[i]>current_max+arr[i]) 
				current_max=arr[i];
			else
				current_max=current_max+arr[i];
			if(max_so_far<current_max)
				max_so_far=current_max;
		}
		return max_so_far;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(subarraysum(a,n));

	}

}

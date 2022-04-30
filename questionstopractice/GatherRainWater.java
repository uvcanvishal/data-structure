package questionstopractice;

import java.util.Scanner;

public class GatherRainWater {
	private static int gather(int a[],int n) {
		int leftmax=0,rightmax=0,result=0,lo=0,hi=n-1;
		while(lo<=hi) {
			if(a[lo]<a[hi]) {
				if(a[lo]>leftmax) {
					leftmax=a[lo];
				}else{
					result+=leftmax-a[lo];
				}
				lo++;
			}else {
				if(a[hi]>rightmax) {
					rightmax=a[hi];
				}else {
					result+=rightmax-a[hi];
				}
				hi--;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(gather(a,n));

	}

}

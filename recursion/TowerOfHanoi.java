package recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	private static void towerOfHanoi(int disks,char source,char auxilliary,char destination) {
		if(disks==0)
			return;
		towerOfHanoi(disks-1,source,destination,auxilliary);
		System.out.println(source+" "+destination);
		towerOfHanoi(disks-1,auxilliary,source,destination);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int disks=sc.nextInt();
		towerOfHanoi(disks,'a','b','c');

	}

}

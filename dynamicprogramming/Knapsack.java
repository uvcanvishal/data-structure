package dynamicprogramming;

public class Knapsack {
	private static int knapsack(int weight[],int value[],int maxweight,int i) {
		if(i==weight.length || maxweight==0)
			return 0;
		if(weight[i]>maxweight)
			return knapsack(weight, value, maxweight,i+1);
		else {
			int op1=value[i]+knapsack(weight, value, maxweight-weight[i],i+1);
			int op2=knapsack(weight, value, maxweight, i+1);
			return Math.max(op1, op2);
		}
	}
	public static int knapsack(int weight[],int value[],int maxweight) {
		return knapsack(weight,value,maxweight,0);
	}
	private static int knapsackM(int weight[],int value[],int maxweight,int i,int storage[][]) {
		if(i==weight.length || maxweight==0)
			return 0;
		if(storage[i][maxweight]!=-1)
			return storage[i][maxweight];
		if(weight[i]>maxweight)
		{
			storage[i][maxweight]=knapsackM(weight, value, maxweight,i+1,storage);
			return storage[i][maxweight];
		}else {
			storage[i][maxweight]=Math.max(value[i]+knapsackM(weight, value, maxweight-weight[i],i+1,storage),knapsackM(weight, value, maxweight,i+1,storage));
			return storage[i][maxweight];
		}
	}
	public static int knapsackM(int weight[],int value[],int maxweight) {
		int storage[][]=new int[weight.length+1][maxweight+1];
		for(int i=0;i<=weight.length;i++)
			for(int j=0;j<=maxweight;j++)
				storage[i][j]=-1;
		return knapsackM(weight,value,maxweight,0,storage);
	}
	public static int knapsackDP(int weight[],int value[],int maxweight) {
		int storage[][]=new int[weight.length+1][maxweight+1];
		for(int i=0;i<=weight.length;i++) {
			for(int j=0;j<=maxweight;j++) {
				if(i==0 || j==0)
					storage[i][j]=0;
				else if(weight[i-1]>j)
					storage[i][j]=storage[i-1][j];
				else {
					storage[i][j]=Math.max(value[i-1]+storage[i-1][j-weight[i-1]], storage[i-1][j]);
				}
			}
		}
		return storage[weight.length][maxweight];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight[]= {6,1,2,4,5};
		int value[]= {10,5,4,8,6};
		int maxweight=5;
		System.out.println(knapsackDP(weight,value,maxweight));
		System.out.println(knapsackM(weight,value,maxweight));
		System.out.println(knapsack(weight,value,maxweight));
	}

}

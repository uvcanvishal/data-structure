package binarysearchtrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree {
	private BinaryTreeNode<Integer> root;
	private BinaryTreeNode<Integer> prev=null;
	private BinaryTreeNode<Integer> insertData(BinaryTreeNode<Integer> root,int data){
		if(root==null) {
			BinaryTreeNode<Integer> newNode=new BinaryTreeNode<Integer>(data);
			return newNode;
		}
		if(data<root.data)
			root.left=insertData(root.left, data);
		else
			root.right=insertData(root.right, data);
		return root;
	}
	public void insertData(int data) {
		root=insertData(root,data);
	}
	private BinaryTreeNode<Integer> deleteData(BinaryTreeNode<Integer> root,int data){
		if(root==null)
			return null;
		if(data<root.data)
		{
			root.left=deleteData(root.left, data);
			return root;
		}else if(data>root.data) {
			root.right=deleteData(root.right, data);
			return root;
		}else {
			if(root.left==null && root.right==null) {
				return null;
			}else if(root.left==null) {
				return root.right;
			}else if(root.right==null) {
				return root.left;
			}else {
				BinaryTreeNode<Integer> minNode=root.right;
				while(minNode.left!=null) {
					minNode=minNode.left;
				}
				root.data=minNode.data;
				root.right=deleteData(root.right, minNode.data);
				return root;
			}
		}
	}
	public void deleteData(int data) {
		root=deleteData(root,data);
	}
	private void print(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		String s=root.data+"";
		if(root.left!=null)
			s+="L:"+root.left.data+",";
		if(root.right!=null)
			s+="R:"+root.right.data;
		System.out.println(s);
		print(root.left);
		print(root.right);
	}
	public void print() {
		print(root);
	}
	private boolean hasData(BinaryTreeNode<Integer> root,int data) {
		if(root==null)
			return false;
		if(root.data==data)
			return true;
		if(data<root.data)
			return hasData(root.left,data);
		else
			return hasData(root.right,data);
	}
	public boolean hasData(int data) {
		return hasData(root,data);
	}
	private ArrayList<Integer> getRootToNodePath(BinaryTreeNode<Integer> root,int data){
		if(root==null)
			return null;
		if(root.data==data) {
			ArrayList<Integer> output=new ArrayList<>();
			output.add(root.data);
			return output;
		}
		ArrayList<Integer> leftOutput=getRootToNodePath(root.left, data);
		if(leftOutput!=null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		ArrayList<Integer> rightOutput=getRootToNodePath(root.right, data);
		if(rightOutput!=null) {
			rightOutput.add(root.data);
			return rightOutput;
		}else {
			return null;
		}
	}
	public ArrayList<Integer> getRootToNodePath(int data){
		return getRootToNodePath(root,data);
	}
	private int maximum(BinaryTreeNode<Integer> root) {
		if(root==null)
			return Integer.MIN_VALUE;
		return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
	}
	private int minimum(BinaryTreeNode<Integer> root) {
		if(root==null)
			return Integer.MAX_VALUE;
		return Math.min(root.data,Math.min(minimum(root.left),minimum(root.right)));
	}
	public boolean isBST(BinaryTreeNode<Integer> root) {
		if(root==null)
			return true;
		int leftMax=maximum(root.left);
		int rightMin=minimum(root.right);
		if(root.data<=leftMax)
			return false;
		if(root.data>rightMin)
			return false;
		boolean isLeftBst=isBST(root.left);
		boolean isRishtBst=isBST(root.right);
		if(isLeftBst && isRishtBst)
			return true;
		else
			return false;
	}
	public boolean isBST() {
		return isBST(root);
	}
	private Pair<Boolean, Pair<Integer,Integer>> isBST2(BinaryTreeNode<Integer> root){
		if(root==null)
		{
			Pair<Boolean, Pair<Integer,Integer>> output=new Pair<Boolean, Pair<Integer,Integer>>();
			output.first=true;
			output.second=new Pair<Integer,Integer>();
			output.second.first=Integer.MAX_VALUE;
			output.second.second=Integer.MIN_VALUE;
			return output;
		}
		Pair<Boolean, Pair<Integer,Integer>> leftOutput=isBST2(root.left);
		Pair<Boolean, Pair<Integer,Integer>> rightOutput=isBST2(root.right);
		int min=Math.min(root.data,Math.min(leftOutput.second.first,rightOutput.second.first));
		int max=Math.max(root.data,Math.max(leftOutput.second.second,rightOutput.second.second));
		boolean isBST=(root.data>leftOutput.second.second)
				&& (root.data<=rightOutput.second.first)
				&& leftOutput.first && rightOutput.first;
		Pair<Boolean, Pair<Integer,Integer>> output=new Pair<Boolean, Pair<Integer,Integer>>();
		output.first=isBST;
		output.second=new Pair<Integer,Integer>();
		output.second.first=min;
		output.second.second=max;
		return output;
	}
	public Pair<Boolean, Pair<Integer,Integer>> isBST2(){
		return isBST2(root);
	}
	private boolean isBST3(BinaryTreeNode<Integer> root,int min,int max) {
		if(root==null)
			return true;
		if(root.data<min || root.data>max)
			return false;
		boolean isLeftOk=isBST3(root.left, min, root.data-1);
		boolean isRightOk=isBST3(root.right, root.data, max);
		return isLeftOk && isRightOk;
	}
	public boolean isBST3(int min,int max) {
		return isBST3(root,min,max);
	}
	private BinaryTreeNode<Integer> hasData1(BinaryTreeNode<Integer> root,int data) {
		if(root==null)
			return null;
		if(root.data==data)
			return root;
		if(data<root.data)
			return hasData1(root.left,data);
		else
			return hasData1(root.right,data);
	}
	private Pair<Node<Integer>,Node<Integer>> bstToLl(BinaryTreeNode<Integer> root){
		if(root==null) {
			Pair<Node<Integer>,Node<Integer>> output=new Pair<>();
			output.first=null;
			output.second=null;
			return output;
		}
		Pair<Node<Integer>,Node<Integer>> leftTree=bstToLl(root.left);
		Node<Integer> newNode=new Node<Integer>(root.data);
		Pair<Node<Integer>,Node<Integer>> rightTree=bstToLl(root.right);
		Pair<Node<Integer>,Node<Integer>> output=new Pair<>();
		if(leftTree.first!=null) {
			output.first=leftTree.first;
			leftTree.second.next=newNode;
		}else {
			output.first=newNode;
		}
		newNode.next=rightTree.first;
		if(rightTree.first==null) {
			output.second=newNode;
		}else {
			output.second=rightTree.second;
		}
		return output;
	}
	public Node<Integer> bstToLl(){
		Pair<Node<Integer>,Node<Integer>> ans=bstToLl(root);
		return ans.first;
	}
	public BinaryTreeNode<Integer> bstToLl1(BinaryTreeNode<Integer> root){
		if(root==null)
			return root;
		BinaryTreeNode<Integer> head=bstToLl1(root.left);
		if(prev==null) {
			head=root;
		}else {
			prev.right=root;
			root.left=prev;
		}
		prev=root;
		bstToLl1(root.right);
		return head;
	}
	public BinaryTreeNode<Integer> convertArrToBalancedBst(ArrayList<Integer> arr,int start,int end){
		if(start>end) {
			return null;
		}
		int mid=(start+end)/2;
		BinaryTreeNode<Integer> root2=new BinaryTreeNode<Integer>(arr.get(mid));
		root2.left=convertArrToBalancedBst(arr, start, mid-1);
		root2.right=convertArrToBalancedBst(arr, mid+1, end);
		return root2;
	}
	public void rangeK1ToK2(BinaryTreeNode<Integer> root,int k1,int k2) {
		if(root==null)
			return;
		if(root.data>k1)
			rangeK1ToK2(root.left, k1, k2);
		if(root.data>=k1 && root.data<=k2)
			System.out.print(root.data+" ");
		if(root.data<=k2)
			rangeK1ToK2(root.right, k1, k2);
	}
	public static int replaceWithSumOfGreaterNodes(BinaryTreeNode<Integer> root,int sum) {
		if(root==null)
			return 0;
		int right=replaceWithSumOfGreaterNodes(root.right, sum);
		int rootData=root.data;
		root.data=rootData+right+sum;
		int left=replaceWithSumOfGreaterNodes(root.left, root.data);
		return rootData+right+left;
	}
	public static int printNodes(BinaryTreeNode<Integer> root,int elem,int k) {
		if(root==null)
			return -1;
		if(root.data==elem)
		{
			printAtDepthK(root,k);
			return 0;
		}
		int ld=printNodes(root.left, elem, k);
		int rd;
		if(ld==-1) {
			rd=printNodes(root.right, elem, k);
			if(rd==-1) {
					return -1;	
			}else if(rd+1==k) {
				System.out.println(root.data);
				return k;
			}else {
				printAtDepthK(root.left, k-rd-2);
				return rd+1;
			}
		}else if(ld+1==k) {
			System.out.println(root.data);
			return k;
		}else {
			printAtDepthK(root.right, k-ld-2);
			return ld+1;
		}
	}
	public static void printAtDepthK(BinaryTreeNode<Integer> root,int depth) {
		if(root==null)
			return;
		if(depth==0) {
			System.out.println(root.data);
			return;
		}
		printAtDepthK(root.left, depth-1);
		printAtDepthK(root.right, depth-1);
	}
	public static void pairSum(BinaryTreeNode<Integer> root,int k) {
		if(root==null)
			return;
		ArrayList<Integer> list=new ArrayList<>();
		Queue<BinaryTreeNode<Integer>> pendingNodes=new LinkedList<>();
		pendingNodes.add(root);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front=pendingNodes.poll();
			list.add(front.data);
			if(front.left!=null)
				pendingNodes.add(front.left);
			if(front.right!=null)
				pendingNodes.add(front.right);
		}
		for(int i=0;i<list.size();i++) {
			for(int j=0;j!=i && j<list.size();j++) {
				if(list.get(i)+list.get(j)==k) {
					if(list.get(i)<list.get(j)) {
						System.out.println(list.get(i)+" "+list.get(j));
					}else {
						System.out.println(list.get(j)+" "+list.get(i));
					}
				}
			}
		}
	}
	public static int lcaInBst(BinaryTreeNode<Integer> root,int x,int y){
		if(root==null) 
			return -1;
		if(root.data<x && root.data<y)
			return lcaInBst(root.right, x, y);
		if(root.data>x && root.data>y)
			return lcaInBst(root.left, x, y);
		return root.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst=new BinarySearchTree();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements to be added");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			bst.insertData(sc.nextInt());
		}
		bst.print();
		/*bst.insertData(10);
		bst.insertData(20);
		bst.insertData(5);
		bst.insertData(15);
		bst.insertData(3);
		bst.insertData(7);
		bst.print();
		System.out.println("\ndelete data");
		bst.deleteData(10);
		bst.print();
		System.out.println("\nsearch and return true or false");
		System.out.println(bst.hasData(10));
		System.out.println("\nroot to node path");
		ArrayList<Integer> arr=bst.getRootToNodePath(7);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("\n isBST1");
		System.out.println(bst.isBST());
		System.out.println("\n isBST2");
		Pair<Boolean, Pair<Integer,Integer>> ans=bst.isBST2();
		System.out.println(ans.first);
		System.out.println("\n isBST3");
		System.out.println(bst.isBST3(3,20));
		System.out.println("\nsearch and return data");
		BinaryTreeNode<Integer> searched=bst.hasData1(bst.root,10);
		if(searched!=null) {
			System.out.println(searched.data);
		}else
			System.out.println(searched);
		System.out.println("\nbst to linked list using pair");
		Node<Integer> head=bst.bstToLl();
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println("\nbst to linked list using previous");
		BinaryTreeNode<Integer> head1=bst.bstToLl1(bst.root);
		while(head1!=null) {
			System.out.print(head1.data+" ");
			head1=head1.right;
		}
		System.out.println("\narray to balanced bst");
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<7;i++) {
			a.add(i+1);
		}
		BinaryTreeNode<Integer> root1=bst.convertArrToBalancedBst(a, 0, a.size()-1);
		bst.print(root1);
		System.out.println("\nelements in range");
		bst.rangeK1ToK2(bst.root,7,20);
		int ans=replaceWithSumOfGreaterNodes(bst.root, 0);
		bst.print();
		System.out.println("\nnodes at distance k");
		int ans1=printNodes(bst.root,5,1);
		//System.out.println(ans1);
		pairSum(bst.root,12);*/
		System.out.println(lcaInBst(bst.root, 2, 10));
	}

}

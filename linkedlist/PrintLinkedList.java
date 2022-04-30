package linkedlist;

import java.util.Scanner;

public class PrintLinkedList {
	public static Node<Integer> delete(Node<Integer> head,int pos)
	{
		if(head==null)
			return head;
		if(pos==0)
			return head.next;
		Node<Integer> temp=head;
		int i=0;
		while(temp!=null && i<(pos-1)) {
			temp=temp.next;
			i++;
		}
		if(temp==null || temp.next==null)
			return head;
		temp.next=temp.next.next;
		return head;
	}
	public static Node<Integer> insert(Node<Integer> head,int pos,int data){
		Node<Integer> newNode=new Node<Integer>(data);
		Node<Integer> temp=head;
		int i=0;
		if(pos==0) {
			newNode.next=head;
			return newNode;
		}
		while(i<pos-1) {
			temp=temp.next;
			i++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		return head;
	}
	public static Node<Integer> takeInput(){
		Node<Integer> head=null;
		Node<Integer> tail=null;
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		while(data!=-1) {
			Node<Integer> newNode=new Node<Integer>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}else {
				tail.next=newNode;
				tail=newNode;
			}
			data=sc.nextInt();
		}
		return head;
	}
	public static void print(Node<Integer> head) {
		Node<Integer> temp=head;
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Node<Integer> node1=new Node<Integer>(10);
		Node<Integer> node2=new Node<Integer>(20);
		Node<Integer> node3=new Node<Integer>(30);
		node1.next=node2;
		node2.next=node3;*/
		Node<Integer> head=takeInput();
		head=insert(head,3,80);
		print(head);
		head=delete(head,2);
		print(head);
	}

}

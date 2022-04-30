package linkedlist;

import java.util.Scanner;

public class FindNode{
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
			while(head!=null) {
				System.out.print(head.data+" ");
				head=head.next;
			}
			System.out.println();
		}
		public static int find_node(Node<Integer> head,int n) {
			int i=0;
			while(head!=null) {
				if(head.data==n)
					return i;
				head=head.next;
				i++;
			}
			return -1;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			/*Node<Integer> node1=new Node<Integer>(10);
			Node<Integer> node2=new Node<Integer>(20);
			Node<Integer> node3=new Node<Integer>(30);
			node1.next=node2;
			node2.next=node3;*/
			Node<Integer> head=takeInput();
			print(head);
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println(find_node(head,n));
		}

	}




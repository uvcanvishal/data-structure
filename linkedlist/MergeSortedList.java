package linkedlist;

import java.util.Scanner;

public class MergeSortedList{
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
			public static Node<Integer> merge_sorted(Node<Integer> t1,Node<Integer> t2) {
				Node<Integer> h3;
				Node<Integer> t3;
				if(t1==null) {
					h3=t2;
					t3=t2;
				}
				if(t2==null) {
					h3=t1;
					t3=t1;
				}
				if(t1.data<=t2.data) {
					h3=t1;
					t3=t1;
					t1=t1.next;
				}else
				{
					h3=t2;
					t3=t2;
					t2=t2.next;
				}
				while(t1!=null && t2!=null) {
					if(t1.data<=t2.data) {
						t3.next=t1;
						t3=t3.next;
						t1=t1.next;
					}else {
						t3.next=t2;
						t3=t3.next;
						t2=t2.next;
					}
				}
					if(t1==null)
						t3.next=t2;
					else if(t2==null)
						t3.next=t1;
				return h3;
			}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				/*Node<Integer> node1=new Node<Integer>(10);
				Node<Integer> node2=new Node<Integer>(20);
				Node<Integer> node3=new Node<Integer>(30);
				node1.next=node2;
				node2.next=node3;*/
				Node<Integer> head1=takeInput();
				print(head1);
				Node<Integer> head2=takeInput();
				print(head2);
				Node<Integer> head=merge_sorted(head1,head2);
				print(head);
				
			}

		}






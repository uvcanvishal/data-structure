package linkedlist;

import java.util.Scanner;

public class ReverseRecursivelyBetter2{
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
			public static Node<Integer> reverseRecursivelyBetter2(Node<Integer> head) {
				if(head==null||head.next==null)
				{
					return head;
				}
				Node<Integer> reversedTail=head.next;	
				Node<Integer> smallHead=reverseRecursivelyBetter2(head.next);
				reversedTail.next=head;
				head.next=null;
				return smallHead;
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
			    head=reverseRecursivelyBetter2(head);
				print(head);
				
			}

		}







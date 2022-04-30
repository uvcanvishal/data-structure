package linkedlist;

import java.util.Scanner;

public class InsertRecursively{
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
			public static Node<Integer> insertRecursively(Node<Integer> head,int pos,int ele) {
				if(pos==0) {
					Node<Integer> newNode=new Node<Integer>(ele);
					newNode.next=head;
					return newNode;
				}
				if(head==null)
					return head;
				head.next=insertRecursively(head.next,pos-1,ele);
				return head;
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
				int pos=sc.nextInt();
				int ele=sc.nextInt();
			    head=insertRecursively(head,pos,ele);
				print(head);
				
			}

		}









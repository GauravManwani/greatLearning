package reverseLinkedList;

import reverseLinkedList.LinkedList.Node;

public class Client {
	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		linkedList.head=new Node(10);
		linkedList.head.next=new Node(20);
		linkedList.head.next.next=new Node(30);
		linkedList.head.next.next.next=new Node(40);
		
		System.out.println("Original Linked List");
		print(linkedList.head);
		
		ReverseLinkedList reverseLinkedList=new ReverseLinkedList();
		Node newHeadNode=reverseLinkedList.reverse(linkedList.head);
		System.out.println();
		System.out.println("Reversed Linked List");
		print(newHeadNode);
		
	}
	
	private static void print(Node node) {
		while(node!=null) {
			if(node.next!=null) {
			System.out.print(node.data+"->");
			}else {
				System.out.print(node.data);
			}
			node=node.next;
		}
	}
}

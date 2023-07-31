package reverseLinkedList;

import reverseLinkedList.LinkedList.Node;

public class ReverseLinkedList {

	
	public Node reverse(Node head){
		Node prev=null;
		Node current=head;
		Node next=null;
		
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		return head;
	}
}

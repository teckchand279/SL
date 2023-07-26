
public class SinglyLinkedList {
	static class Node{
		private int data;
		private Node next;
		public Node() {
			data = 0;
			next = null;
		}
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	
	public SinglyLinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		
		Node newnode = new Node(value);

		if(isEmpty())
		
			head = newnode;
		
		else {
			
			newnode.next = head;
		
			head = newnode;
		}
	}
	
	public void displayList() {
		
		Node trav = head;
		System.out.println("Linked List");
		while(trav != null) {
			
			System.out.println(trav.data);
			
			trav = trav.next;
		}
	}
	
	public void addLast(int value) {
	
		Node newnode = new Node(value);
	
		if(isEmpty())
			
			head = newnode;
	
		else {
			
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
		
			trav.next = newnode;
		}
	}
	
	public void addPos(int value, int pos) {
		
		if(isEmpty() || pos <= 1)
			
			addFirst(value);
	
		else {
			
			Node newnode = new Node(value);
			
			int i = 1;
			Node trav = head;
			while(i++ < pos - 1) {
				
				if(trav.next == null)
					break;
				trav = trav.next;
			}
		
			newnode.next = trav.next;
		
			trav.next = newnode;
		}
	}
	
	public void delFirst() {
		
		if(isEmpty())
			
			return;
		
		else
			
			head = head.next;
	}
	
	public void delLast() {
	
		if(isEmpty())
			
			return;
		
		else if (head.next == null)
			
			head = null;
		
		else {
			
			Node trav = head;
			while(trav.next.next != null)
				trav = trav.next;
		
			trav.next = null;
		}
	}
	
	public void delPos(int pos) {
	
		if(isEmpty() || pos <= 0)
			
			return;
		
		else if (pos == 1)
			delFirst();
		
		else if(head.next == null)
		
			head = null;

		else {
			
			Node trav = head;int i = 1;
			while(i++ < pos - 1) {
				System.out.println("i = " + i + "data = " + trav.data);
		
				if(trav.next.next == null)
					return;
				trav = trav.next;
			}
		
			trav.next = trav.next.next;
		}
	}
	public void delAll() {
		head = null;
		
	}
	
	void reverseLinkedList() {
		Node oldHead=head;
		head=null;
		while(oldHead!=null) {
		
		Node trav=oldHead;
		oldHead=oldHead.next;
		
		trav.next=head;
		head=trav;
		}
	}
	void findMiddle() {
		int count=1;
		Node trav=head;
		while(trav!=null) {
			trav=trav.next;
			count++;
		}
		count=count/2;
		Node trav1=head;
		for(int i=1;i<count;i++) {
			trav1=trav1.next;
		}
		System.out.println("middle no. is :"+trav1.data);
	}
	

}



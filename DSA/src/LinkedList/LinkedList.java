package LinkedList;

public class LinkedList implements LinkedListADTinterface{

		Node head = null;
		Node tail = null;
	 static int size = 0;
	 @Override
	 public void addFirst(int e) {
		 Node node = new Node(e);
		if(head==tail && tail==null) {
			head = tail = node;
		}
		
		else {
			node.next = head;
			head = node;
		}
		size++;
	 }
	 @Override
	 public void addLast(int e) {
	     Node node = new Node(e);
		 tail.next = node;
		 tail = node;
		 size++;
	 }
	 @Override
	 public void addAt(int e, int pos) {
		Node node = new Node(e);
		Node curr = head;
		for(int i=0; i<pos-1;i++) {
			curr = curr.next;
		}
		node.next = curr.next;
		curr.next = node;
		size++;
	 }
	 @Override
	 public void deleteFirst() {
		Node curr = head;
		head = head.next;
		curr.next = null;
		size--;
	 }
	 @Override
	 public void deleteLast() {
		 Node curr = head;
		while(curr.next!=tail) {
			curr = curr.next;
		}
		
		tail = curr;
		tail.next = null;
		size--;
		
	 }
	 @Override
	 public void deleteAt(int pos) {
			Node curr = head;
			if(pos==0) {
				head = curr.next;
				curr.next = null;
				size--;
				return;
			}
			for(int i=0; i<pos-1;i++) {
				curr = curr.next;
			}
			curr.next = curr.next.next;
			size--;
	 }
	 @Override
	 public void traverse() {
		 
		 if(head == null && tail == null) {
			 System.out.println("There is no Data to print.");
			 return;
		 }
		 Node curr = head;
	    while(curr!=null) {
	    	if(curr.next==null) {
	    		System.out.print(curr.data);
	    	}
	    	else {
	    		System.out.print(curr.data+"->");
	    	}
	    	curr = curr.next;
	    	
	    }
	    System.out.println();
	 }
	 
}

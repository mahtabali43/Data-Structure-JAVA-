package LinkedList.Doubly;


public class DoublyLinkedList implements DoublyLinkedListInterface{
 
	Node head = null;
	Node tail = null;
	int size;
	
	@Override
	public void addFirst(int e) {
		if(head == tail && tail == null) {
			Node node = new Node(e);
			head = tail = node;
			head.prev = null;
			tail.next = null;
		}
		else {
	       Node node = new Node(e);
	       node.next = head;
	       head = node;
  		}
		size++;
	}

	@Override
	public void addLast(int e) {
	    
		if(head==tail && tail == null) {
			addFirst(e);
			return;
		}
		else {
			Node node = new Node(e);
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
		size++;
	}

	@Override
	public void addAt(int e, int pos) {
		if(pos == 0) {
			addFirst(e);
			
		}
		else if(pos == size-1) {
			addLast(e);
		}
		else {
			Node node = new Node(e);
			Node curr = head;
			for(int i=0; i<pos-1; i++) {
				curr = curr.next;
			}
			node.next = curr.next;
			curr.next = node;
			node.prev = curr;
			node.next.prev = node;
		}
		size++;
	}

	@Override
	public void deleteFirst() {
		if(head==tail && tail==null) {
			System.out.println("There is no Data...Pagal ho kya be...");

			return;
		}
		else {
			
			head = head.next;
			head.prev = null;
		}
		size--;
	}

	@Override
	public void deleteLast() {
		if(head==tail && tail==null) {
			System.out.println("There is no Data...Pagal ho kya be...");

			return;
		}
		else {
			tail = tail.prev;
			tail.next = null;
		}
		size--;
	}

	@Override
	public void deleteAt(int pos) {
		if(pos == 0) {
			deleteFirst();
			
		}
		else if(pos == size-1) {
			deleteLast();
		}
		else {
			
			Node curr = head;
			for(int i=0; i<pos-1; i++) {
				curr = curr.next;
			}
			curr.next = curr.next.next;
			curr.next.prev = curr;
		}
		size--;
	}

	@Override
	public void traverse() {
		Node curr = head;
		while(curr!=null) {
			if(curr.next == null) {
				System.out.print(curr.data);
			}
			else {
				System.out.print(curr.data+"<-->");
			}
			curr = curr.next;
		}
		System.out.println();
	}

}

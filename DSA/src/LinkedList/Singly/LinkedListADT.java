package LinkedList.Singly;

public class LinkedListADT implements LinkedListADTinterface{

	Node head = null;
	Node tail = null;
	int size = 0;
	@Override
	public void addFirst(int e) {
		if(head == tail && tail == null) {
		   Node node = new Node(e);
		   head = tail = node;
		  
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
		if(tail == head && head == null) {
			addFirst(e);
			
			return;
		}
		else {
			Node node = new Node(e);
			tail.next = node;
			tail = node;
			size++;
			return;
		}
		
	}

	@Override
	public void addAt(int e, int pos) {
		if(pos == 0) {
			addFirst(e);
			return;
		}
		else if(pos == size - 1) {
			addLast(e);
			return;
		}
		else {
			Node node = new Node(e);
			Node curr = head;
			for(int i = 0; i<pos - 1 ; i++) {
				curr = curr.next;
			}
			node.next = curr.next;
			curr.next = node;
			size++;
			return;
		}
		
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
		if(pos == 0) {
			deleteFirst();
			size--;
			return;
		}
		else if(pos == size-1) {
			deleteLast();
			size--;
			return;
		}
		else {
			Node curr = head;
			for(int i = 0; i<pos - 1 ; i++) {
				curr = curr.next;
			}
			curr.next = curr.next.next;
			size--;
			return;
		}
		
	}

	@Override
	public void travarse() {
		Node curr = head;
		while(curr!=null) {
			if(curr.next == null) {
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

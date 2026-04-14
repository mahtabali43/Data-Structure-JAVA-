package LinkedList;

public class LinkedListApp {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(11);
		ll.traverse();
//		ll.addFirst(10);
//		ll.addFirst(11);
//		ll.addFirst(12);
//		ll.traverse();
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		
		ll.addAt(50, 3);
		ll.addAt(60, 4);
		ll.addAt(70, 5);
		ll.traverse();
		System.out.println("Deleting first from here");
		ll.deleteFirst();
		ll.deleteFirst();
		ll.deleteFirst();
		ll.traverse();
		System.out.println("Deleting last from here");
		ll.deleteLast();
		ll.deleteLast();
		ll.deleteLast();
		ll.traverse();
		System.out.println("Deleting At any position from here");
		ll.deleteAt(1);
		ll.deleteAt(0);
		ll.traverse();
		System.out.println("Size: "+ll.size);
	}

}

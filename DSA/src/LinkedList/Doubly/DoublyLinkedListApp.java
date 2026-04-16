package LinkedList.Doubly;

public class DoublyLinkedListApp {

	public static void main(String[] args) {
        
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.deleteFirst();
		dl.addFirst(10);
		dl.addFirst(11);
		dl.addFirst(12);
		dl.addFirst(13);
		dl.traverse();
		System.out.println("At at end");
        dl.addLast(14);
        dl.traverse();
        dl.addLast(15);
        dl.traverse();
        dl.addLast(16);
        dl.traverse();
        dl.addLast(17);	
        dl.traverse();
        System.out.println("Add at");
        dl.addAt(20, 3);
        dl.traverse();
        dl.addAt(30, 4);
        dl.traverse();
        dl.addAt(40, 5);
        dl.traverse();
        dl.addAt(50, 6);
        dl.traverse();
        dl.addAt(60, 7);
        dl.traverse();
        dl.deleteLast();
        dl.traverse();
        dl.deleteLast();
        dl.traverse();
        dl.deleteLast();
        dl.traverse();
        dl.deleteAt(4);
        dl.traverse();
        System.out.println("Size is:"+dl.size);
	}

}

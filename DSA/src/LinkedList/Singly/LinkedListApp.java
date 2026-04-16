package LinkedList.Singly;

public class LinkedListApp {

	public static void main(String[] args) {
		
		LinkedListADT ll = new LinkedListADT();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.addLast(60);
		ll.addLast(70);
		ll.travarse();

		ll.addAt(100, 0);
		ll.addAt(100, ll.size -1);
		ll.addAt(110, 3);
		ll.travarse();
		ll.deleteFirst();
		ll.deleteFirst();
		ll.deleteFirst();

		ll.travarse(); 
 
		ll.deleteLast();
		ll.deleteLast();
		ll.deleteLast();
		ll.travarse(); 
		System.out.println("Delete at");
        ll.deleteAt(2);
        ll.travarse(); 
        ll.deleteAt(1);
        ll.travarse(); 
        ll.addFirst(22);
        ll.addFirst(11);
        ll.travarse();
		System.out.println("Size is:"+ll.size);
		
	}

}

package Tree.DFS;

public class BinaryTreeApp {

	public static void main(String[] args) {
		
		BinaryTreeOrdered bt = new BinaryTreeOrdered();
		bt.Insert(10);
		bt.Insert(13);
		bt.Insert(5);
		bt.Insert(4);
		bt.Insert(7);
		bt.Insert(12);
		bt.Insert(16);
		bt.Insert(14);
		bt.Insert(20);
	    
		System.out.print("PreOrder: ");

		bt.PreOrderTraverse();
		System.out.println();
		System.out.print("InOrder: ");

		bt.InOrderTraverse();
		System.out.println();
		System.out.print("PostOrder: ");

		bt.PostOrderTraverse();
		
		
		
		
		
		
		
		
		
		
		

//		BinaryTree bt = new BinaryTree();
//	    Node n1 = new Node(10);
//	    bt.root = n1;
//	    Node n2 = new Node(11);
//	    Node n3 = new Node(12);
//	    Node n4 = new Node(13);
//	    Node n5 = new Node(18);
//	    Node n6 = new Node(15);
//	    Node n7 = new Node(28);
//	    Node n8 = new Node(27);
//	    Node n9 = new Node(37);
//		n1.lchild = n2;
//		n1.rchild = n5;
//		n2.lchild = n3;
//		n2.rchild = n4;
//		n3.lchild = null;
//        n3.rchild = null;
//		n5.lchild = n6;
//		n5.rchild = n7;
//		n6.lchild = null;
//		n6.rchild = null;
//		n7.lchild = n8;
//		n7.rchild = n9;
//		System.out.print("InOrder: ");
//		bt.InOrder(n1);
//		System.out.println();
//		System.out.print("PreOrder: ");
//		bt.PreOrder(n1);
//		System.out.println();
//		System.out.print("PostOrder: ");
//		bt.PostOrder(n1);
//		
//		
	}

	

}

package Tree.DFS;

public class BinaryTreeOrdered {

	Node root ;
	
	void Insert(int data) {
//		if(root==null) {
//			root = new Node(data);
//			return;
//		}
		root = insertt(root, data);
		
		}

// insertion recursion method 1
	
	
	private Node insertt(Node root, int data) {
		
		if(root == null) {
			 root = new Node(data);
			 return root;
		}
		 if(data<=root.data) {
			root.lchild = insertt(root.lchild, data);
		}
		else if(data>root.data) {
			root.rchild = insertt(root.rchild, data);
		}
		return root;
	}

	
	// insertion recursion method 1
	
//	private Node insertt(Node root, int data) {
//		
//		if(data<root.data) {
//			if(root.lchild!=null) {
//				insertt(root.lchild, data);
//			}
//			else{
//				Node node = new Node(data);
//				root.lchild = node;
//				
//			}
//		}
//		else {
//			if(root.rchild!=null) {
//				insertt(root.rchild, data);
//			}
//			else {
//				Node node = new Node(data);
//				root.rchild = node;
//				
//			}
//		}
//		
//		return root;
//	}
	
	void PreOrderRec(Node root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.data+" ");
		
		if(root.lchild!=null) {
			PreOrderRec(root.lchild);
		}
		if(root.rchild!=null) {
			PreOrderRec(root.rchild);
		}
		
	}

	void PreOrderTraverse() {
		 PreOrderRec(root);
	}

	private void PostOrderRec(Node root) {
		if(root == null) {
			return;
		}
		
		if(root.lchild!=null) {
			PostOrderRec(root.lchild);
		}
		if(root.rchild!=null) {
			PostOrderRec(root.rchild);
		}
		
		System.out.print(root.data+" ");
	}
	void PostOrderTraverse() {
		PostOrderRec(root);
	}

	private void InOrderRec(Node root) {
		if(root == null) {
			return;
		}
		
		if(root.lchild!=null) {
			InOrderRec(root.lchild);
		}
		
		System.out.print(root.data+" ");
		
		if(root.rchild!=null) {
			InOrderRec(root.rchild);
		}
		
		
	}
	void InOrderTraverse() {
		InOrderRec(root);
	}
}

package Tree.DFS;

public class BinaryTreeOrdered {

	Node root;
	
	void Insert(int data) {
		
		root = insertt(root, data);
		
		}


	
	private Node insertt(Node root, int data) {
		
		if(root == null) {
			 root = new Node(data);
		}
		else if(data<=root.data) {
			root.lchild = insertt(root.lchild, data);
		}
		else if(data>root.data) {
			root.rchild = insertt(root.rchild, data);
		}
		return root;
	}

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

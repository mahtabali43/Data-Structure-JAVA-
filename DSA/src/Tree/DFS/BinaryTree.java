package Tree.DFS;



public class BinaryTree {
         Node root;
         

	public void InOrder(Node root) {
		if(root==null) {
			return;
		}
		if(root.lchild!=null) {
			InOrder(root.lchild);
		}
		System.out.print(root.data+" ");
		
		if(root.rchild!=null) {
			InOrder(root.rchild);
		}
		
	}

	
	public void PostOrder(Node root) {
		if(root==null) {
			return;
		}
		if(root.lchild!=null) {
			PostOrder(root.lchild);
		}
		
		if(root.rchild!=null) {
			PostOrder(root.rchild);
		}
		System.out.print(root.data+" ");
		

	}

	public void PreOrder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");

		if(root.lchild!=null) {
			PreOrder(root.lchild);
		}
		
		if(root.rchild!=null) {
			PreOrder(root.rchild);
		}
	}

}

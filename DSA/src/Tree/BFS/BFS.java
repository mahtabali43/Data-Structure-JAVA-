package Tree.BFS;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFS {
      Node1 root;
	
      void Insert(int data) {
//  		if(root==null) {
//  			root = new Node(data);
//  			return;
//  		}
  		root = insertt(root, data);
  		
  		}

  // insertion recursion method 1
  	
  	
  	private Node1 insertt(Node1 root, int data) {
  		
  		if(root == null) {
  			 root = new Node1(data);
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
      
      
      
	void BFS_traverse(Node1 root) {
		Queue<Node1> q = new ArrayDeque<>();
   // 1. Addint it into Queue
		q.offer(root);
		
		while(!q.isEmpty()) {
//			int a = q.peek().data;
		Node1 curr = q.peek();
		
		//2. Process of data
		System.out.print(curr.data+" ");
		if(curr.lchild!=null) {
			q.add(curr.lchild);
		}
		if(curr.rchild!=null) {
			q.add(curr.rchild);
		}
		
		
		
		
		// 3. Remove the Data from the queue
			q.poll();
			
		}
		
		
	}
	
}


//Insert	add(e)	offer(e)
//Remove	remove()	poll()
//Examine	element()	peek()
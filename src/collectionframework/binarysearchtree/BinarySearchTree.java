package collectionframework.binarysearchtree;

public class BinarySearchTree {
	
	class Node{
		int data;
		Node left,right;
		
		public Node(int data) {
			this.data = data;
			left=right=null;
		}
	}
	
	static Node root;
	
	public void insert(int data) {
		
		root = insRec(root,data);
		
	}
	
	public Node insRec(Node root,int data) {
		if(root==null) {
			root = new Node(data);
		}
		else if(data<=root.data) {
			root.left = insRec(root.left,data);
		}
		else {
			root.right = insRec(root.right,data);
		}
		return root;
	}
	
	public void inOrder(Node root) {
		if(root==null) return;
		
		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.right);
	}
	
	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
		b.insert(23);
		
		b.insert(43);
		b.insert(11);
		b.insert(56);
		b.insert(0);
		b.insert(-34);
		
		b.inOrder(root);

	}

}

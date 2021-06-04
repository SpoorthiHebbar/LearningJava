package collectionframework;

import java.util.Scanner;

public class TreeTraversals {
	 static Scanner sc  = null;
	 
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Nodex root;
		root = create();
//		preOrder(root);
//		System.out.println();
//		inOrder(root);
//		System.out.println();
//		postOrder(root);	
		int x = sc.nextInt();
		System.out.println(search(root,x));
//		if(x==1)
//			System.out.println("found");
//		else
//			System.out.println("not found");
	}
	
	public static Nodex create() {
		Nodex root=null;
		System.out.println("Enter data:");
		int data = sc.nextInt();
		
		root = new Nodex(data);
		
		if(root.data==-1) return null;
		
		System.out.println("Enter data for left of "+ root.data);
		root.left = create();
		
		System.out.println("Enter data for right of "+ root.data);
		root.right = create();
		
		return root;
	}
	
	static void preOrder(Nodex root) {
		if(root==null) return;
		
		System.out.print(root.data+ " ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	static boolean search(Nodex root,int data) {
		if(root == null) return false;
		
		
		if(root.data == data) return true;
		if(search(root.left,data)==true) return true;
		if(search(root.right,data)==true) return true;
		
		
		return false;
	}
	
	static void inOrder(Nodex root) {
		if(root==null) return;
		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.right);
	}
	
	static void postOrder(Nodex root) {
		if(root==null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+ " ");
	}
}
 class Nodex{
	int data;
	Nodex left,right;
	
	public Nodex(int data) {
		this.data = data;
	}
}

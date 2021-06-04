package collectionframework;

import java.util.Scanner;

public class Tree {
	
	static Scanner sc =null;
	public static void main(String[] args) {
		sc= new Scanner(System.in);
		create();
		
	}
	
	
	static Node create() {
		Node root=null;
		System.out.println("Enter data:");
		int data = sc.nextInt();
		
		if(data==-1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter data for left of "+ data);
		root.left = create();
		
		System.out.println("Enter data for right of "+ data +":");
		root.right = create();
		
		return root;
	}
}
class Node{
	int data;
	Node left,right;
	
	public Node(int data) {
		this.data = data;
	}
}
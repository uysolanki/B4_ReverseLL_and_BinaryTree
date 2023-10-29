package binarytree;

import java.util.Scanner;

public class DynamicBinaryTree {
	static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		Node root=createBinaryTree();
		System.out.println("Preorder : ");
		preOrder(root);
		System.out.println("\nPostorder : ");
		postOrder(root);
		int numberOfNodes=countOfNode(root);
		System.out.println("Number of Nodes are "+ numberOfNodes);
		int treeWeight=totalWeightOfTree(root);
		System.out.println("weight of tree is "+ treeWeight);
	}
	
	private static int totalWeightOfTree(Node root) {
		if(root==null)
			return 0;
		
			int leftSum=totalWeightOfTree(root.left);
			int rightSum=totalWeightOfTree(root.right);
			return leftSum+rightSum+root.data;
	}
	private static int countOfNode(Node root) {
		if(root==null)
		return 0;
		int leftNodes=countOfNode(root.left);
		int rightNodes=countOfNode(root.right);
		return leftNodes+rightNodes+1;
		
	}
	private static void postOrder(Node root) {
		if(root!=null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+",");
		}
		
	}
	private static void preOrder(Node root) {
		if(root!=null)
		{
			System.out.print(root.data+",");
			preOrder(root.left);
			preOrder(root.right);
		}
		
	}
	private static Node createBinaryTree() {
		Node root=null;
		System.out.println("Enter Data");
		int data=sc.nextInt();
		if(data==-1)
			return null;
		
		root=new Node(data);
		System.out.println("Enter Left Data for "+data);
		root.left=createBinaryTree();
		System.out.println("Enter Right Data for "+data);
		root.right=createBinaryTree();
		return root;
	}

}

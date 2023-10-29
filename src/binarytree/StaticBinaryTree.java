package binarytree;

public class StaticBinaryTree {
  static int idx=-1;
	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		StaticBinaryTree sbt=new StaticBinaryTree();
		Node root=sbt.createTree(nodes);
		System.out.println("Preorder : ");
		preOrder(root);
		System.out.println("\nPostorder : ");
		postOrder(root);
		int numberOfNodes=countOfNode(root);
		System.out.println("Number of Nodes are "+ numberOfNodes);
		int treeWeight=totalWeightOfTree(root);
		System.out.println("weight of tree is "+ treeWeight);
	}

	private Node createTree(int[] nodes) {
		idx++;
		if(nodes[idx]==-1)
		return null;
		
		Node nn=new Node(nodes[idx]);
		nn.left=createTree(nodes);
		nn.right=createTree(nodes);
		
		return nn;
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
}

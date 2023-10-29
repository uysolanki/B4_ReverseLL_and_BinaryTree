import java.util.Scanner;

public class UserdefinedLinkedList {
	public static void main(String[] args) {
		Node head=null;
		head=create(head);//passing null and it will return with add of 1st node
		System.out.println("Display Original LIST");
		displayList(head);
		head=reverseList(head);
		System.out.println("Display After Reversal");
		displayList(head);
	}

	private static Node reverseList(Node head) {
		Node left=null;
		Node current=head;
		Node right=null;
		
		while(current!=null)
		{
			right=current.next;
			current.next=left;
			left=current;
			current=right;
		}
		return left;
	}

	private static Node create(Node head) {
		Scanner sc=new Scanner(System.in);
		Node temp=null,nn;
		System.out.println("Please enter length of LL");
		int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			System.out.println("Enter data for "+i + " Node");//10,20
			int data=sc.nextInt();
				nn=new Node(data);
				if(head==null)
				{
				head=temp=nn;
				}
				else
				{
				temp.next=nn;
				temp=temp.next;
				}
		}
		return head;
	}
	
	private static void displayList(Node temp) {
		while(temp!=null)
		{
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.println("NULL");
	}

}

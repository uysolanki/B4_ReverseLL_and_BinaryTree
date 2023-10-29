
public class HardCodedLinkedList {

	public static Node head=null;
	public static void main(String[] args) {
		HardCodedLinkedList list=new HardCodedLinkedList();
		list.head=new Node(10);
		list.head.next =new Node(20);
		list.head.next.next =new Node(30);
		list.head.next.next.next =new Node(40);
		
		displayList(head);
			
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

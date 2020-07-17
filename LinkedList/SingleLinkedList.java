import java.util.Scanner;

class SingleLinkedList 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Node head=null;
		int val=Integer.MIN_VALUE;
		int pos=Integer.MIN_VALUE;

		while(true)
		{
			System.out.println();
			System.out.println("*******MENU************");
			System.out.println("0.Exit key!");
			System.out.println("1.Insert at Begin.");
			System.out.println("2.Insert at End.");
			System.out.println("3.Insert at Position.");
			System.out.println("4.Delete at Begin.");
			System.out.println("5.Delete at End.");
			System.out.println("6.Delete at Position.");
			System.out.println("7.Reverse LinkedList.");
			System.out.println("8.Number of Nodes.");
			System.out.println("9.Display LinkedList");
			System.out.println("***********************");
			System.out.println();

			System.out.println("Please Enter choice:");
			int choice=sc.nextInt();

			switch(choice)
			{
				case 0:
				System.out.println("Thanks user!");
				System.out.println();
				System.exit(0);

				case 1: 
				System.out.println("Enter value:");
				val=sc.nextInt();
				head=insertAtBegin(head, val);
				break;

				case 2: 
				System.out.println("Enter value:");
				val=sc.nextInt();
				head=insertAtEnd(head, val);
				break;

				case 3:
				System.out.println("Enter value:");
				val=sc.nextInt();
				System.out.println("Enter position:");
				pos=sc.nextInt();
				head=insertAtPosition(head, val, pos);
				break;

				case 4:
				head=deleteAtBegin(head);
				break;

				case 5:
				head=deleteAtEnd(head);
				break;

				case 6:
				if(head==null){
					System.out.println("LinkedList empty!");
					break;
				}
				else{
					System.out.println("Enter position:");
				    pos=sc.nextInt();
				    head=deleteAtPosition(head, pos);
				    break;
				}

				case 7:
				head=reverse(head);
				break;
				
				case 8:
				int len=length(head);
				System.out.println("Present Nodes:");
				System.out.println(len);
				break;

				case 9: 
				display(head);
				break;

				default: System.out.println("Invalid choice!");
			} 
		}
	}

	private static Node insertAtBegin(Node head, int val)
	{
		Node node=new Node(val);
		if(head==null){
			head=node;
			System.out.println("Succesfully insert!");
		}

		else{
			node.next=head;
			head=node;
			System.out.println("Succesfully insert!");
		}
		return head;
	}

	private static Node insertAtEnd(Node head, int val)
	{
		Node node=new Node(val);
		if(head==null) head=node;

		else{
			Node cursor=head;
			while(cursor.next!=null)
				cursor=cursor.next;

			cursor.next=node;
			System.out.println("Succesfully insert!");
		}
		return head;
	}

	private static Node insertAtPosition(Node head, int val, int pos)
	{
		int len=length(head);
		
		if(pos==0 || pos>len+1){
			System.out.println("Invalid Position!");
			return head;
		}

		Node node=new Node(val);

		if(pos==1){
			node.next=head;
			head=node;
			System.out.println("Succesfully insert!");
		}

		else{
			Node cursor=head;
			for(int i=1;i<pos-1;i++)
			cursor=cursor.next;
			
			node.next=cursor.next;
			cursor.next=node;
			System.out.println("Succesfully insert!");
		}
		return head;
	}

	private static Node deleteAtBegin(Node head)
	{
		if(head==null) System.out.println("LinkedList empty!");
		
		else{
			head=head.next;
			System.out.println("Succesfully deleted!");
		}
		return head;
	}

	private static Node deleteAtEnd(Node head)
	{
		if(head==null){
			System.out.println("LinkedList empty!");
			return head;
		}
		
		int len=length(head);
		if(len==1){
			head=head.next;
			System.out.println("Succesfully deleted!");
		}
		else{
			Node cursor=head;
			while(cursor.next.next!=null)
				cursor=cursor.next;

			Node nextNode = cursor.next.next;
            cursor.next = nextNode;
			System.out.println("Succesfully deleted!");
		}
		return head;
	}

	private static Node  deleteAtPosition(Node head, int pos)
	{
		int len=length(head);
		if(pos==0 || pos>len){
			System.out.println("Invalid Position!");
			return head;
		}
		else if(pos==1)
		{
			head=head.next;
			System.out.println("Succesfully deleted!");
		}

		else{
			Node cursor=head;
			for(int i=1;i<pos-1;i++)
			cursor=cursor.next;

			Node nextNode = cursor.next.next;
            cursor.next = nextNode;
			System.out.println("Succesfully deleted!");
		}
		return head;
	}

	private static Node reverse(Node head)
	{
		if(head==null){
			System.out.println("LinkedList Empty!");
			return head;
		}

		int len=length(head);
		if(len==1){
			System.out.println("Succesfully reverse!");
			return head;
		}

		else{
			System.out.println("Succesfully reverse!");
			Node start=head;
			Node end=head;
			int i=0; 
			int j=len-1; 
			int k=0;

			while(i<j)
			{
				k=0;
				while(k<j)
				{
					end=end.next;
					k++;
				}
				int temp=start.data;
				start.data=end.data;
				end.data=temp;
				i++; j--;
				start=start.next;
				end=head;
			}
		}
		return head;
	}

	private static void display(Node head)
	{
		if(head==null) System.out.println("LinkedList Empty!");
		
		else{
			Node temp=head;
			System.out.println("LinkedList Elements:");
			while(temp!=null)
			{
				System.out.println(temp.data);
			    temp=temp.next;
			}
		}
	}

	private static int length(Node head)
	{
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		return count;
	}
}

class Node
{
	int data;
	Node next;
	Node(int val){
		this.data=val;
		this.next=null;
	}
}

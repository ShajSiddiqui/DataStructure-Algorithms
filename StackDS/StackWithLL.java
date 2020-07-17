import java.util.Scanner;

class StackWithLL
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Node top=null;
		
		while(true)
		{
			System.out.println();
			System.out.println("******MENU*******");
			System.out.println("1. PUSH.");
			System.out.println("2. POP.");
			System.out.println("3. PEEK.");
			System.out.println("4. DISPLAY.");
			System.out.println("5. EXIT.");
			System.out.println("******************");
			System.out.println();

			System.out.println("Enter your choice:");
			int choice=sc.nextInt();

			switch(choice)
			{
				case 1:
				System.out.println("Enter value:");
				int val=sc.nextInt();
				top=push(top, val);
				break;

				case 2:
				top=pop(top);
				break;

				case 3:
				peek(top);
				break;

				case 4:
				display(top);
				break;
				
				case 5:
				System.out.println("Thanks user!");
				System.out.println();
				System.exit(0);

				default: System.out.println("Invalid choice!");
			}
		}
	}

	private static Node push(Node head, int val)
	{
		Node node=new Node(val);

		node.next=head;
		head=node;
		System.out.println("Succesfully push!");
		
		return head;
	}

	private static Node pop(Node head)
	{
		if(head==null) System.out.println("Stack Empty!");
		
		else{
			head=head.next;
			System.out.println("Succesfully pop!");
		}
		return head;
	}

	private static void peek(Node head)
	{
		if(head==null) System.out.println("Stack Empty!");

		else{
			System.out.println("Peek value:");
			System.out.println(head.data);
		}
	}

	private static void display(Node head)
	{
		if(head==null) System.out.println("Stack Empty!");
		
		else{
			Node temp=head;
			System.out.println("Stack Elements:");
			while(temp!=null)
			{
				System.out.println(temp.data);
			    temp=temp.next;
			}
		}
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



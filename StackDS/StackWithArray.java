import java.util.Scanner;

class StackWithArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("___WELCOME USER!__");
		System.out.println();
		System.out.println("Declare capacity:");
		int size=sc.nextInt();
		
		Stack stack=new Stack(size);
		int value=Integer.MIN_VALUE;
		
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
				value=sc.nextInt();
				stack.push(value);
				break;

				case 2:
				stack.pop();
				break;

				case 3:
				stack.peek();
				break;

				case 4:
				stack.print();
				break;
				
				case 5:
				System.out.println("Thanks user!");
				System.out.println();
				System.exit(0);

				default: System.out.println("Invalid choice!");
			}
		}
	}

}


class Stack {

    int[] arr;
    int top;

    Stack(int size) {
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int item) {
        if(isFull()) {
            System.out.println("Stack is already full!");
            return;
        }
        this.arr[++this.top] = item;
		System.out.println("Successfully push!!");
    }
    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
		top--;
		System.out.println("Pop-up successfully!");
    }

    public void peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Peek value:\n"+this.arr[this.top]);
    }

    public boolean isFull() {
        return this.top + 1 == this.arr.length;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public void print() {
		if(isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
		System.out.println("Stack values:");
        for(int i=this.top; i>=0; i--) {
            System.out.println(this.arr[i]);
        }
    }
}

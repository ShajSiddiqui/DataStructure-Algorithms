import java.util.Scanner;

class BubbleSort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int Size=sc.nextInt();
		int[] input=new int[Size];
		System.out.println("Enter values:");
		for(int i=0;i<Size;i++) input[i]=sc.nextInt();
		sortMethod(input, Size);
		printMethod(input);
	}

	private static void sortMethod(int[] arr, int n)
	{
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	private static void printMethod(int[] arr)
	{
		System.out.println("Sorting values:");
		for(int x: arr) System.out.println(x);
	}
}

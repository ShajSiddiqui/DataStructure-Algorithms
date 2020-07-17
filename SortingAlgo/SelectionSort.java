import java.util.Scanner;

class SelectionSort 
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
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
					min=j;
			}
			if(min!=i)
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
	}

	private static void printMethod(int[] arr)
	{
		System.out.println("Sorting values:");
		for(int x: arr) System.out.println(x);
	}
}

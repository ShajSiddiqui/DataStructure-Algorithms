import java.util.Scanner;

class InsertionSort 
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
			int value=arr[i];
			int hole=i;
			while(hole>0 && arr[hole-1]>value)
			{
				arr[hole]=arr[hole-1];
				hole=hole-1;
			}
			arr[hole]=value;
		}
	}

	private static void printMethod(int[] arr)
	{
		System.out.println("Sorting values:");
		for(int x: arr) System.out.println(x);
	}
}

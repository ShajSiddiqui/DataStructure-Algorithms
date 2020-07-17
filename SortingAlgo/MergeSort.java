import java.util.Scanner;

class MergeSort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int Size=sc.nextInt();
		int[] input=new int[Size];
		System.out.println("Enter values:");
		for(int i=0;i<Size;i++) input[i]=sc.nextInt();
		mergeSort(input, 0, Size-1);
		printMethod(input);
	}

	private static void mergeSort(int[] arr, int beg, int end)
	{
		if(beg<end)
		{
			int mid=(beg+end)/2;
			mergeSort(arr, beg, mid);
			mergeSort(arr, mid+1, end);
			merge(arr, beg, mid, end);
		}
	}

	private static void merge(int[] arr, int start, int mid, int end)
	{
		int n1 = mid - start + 1; 
        int n2 = end - mid; 
  
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        for (int i=0; i<n1; ++i) 
            L[i] = arr[start + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[mid + 1+ j]; 
  
        int i = 0, j = 0;   
        int k = start; 
        
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
	}

	private static void printMethod(int[] arr)
	{
		System.out.println("Sorting values:");
		for(int x: arr) System.out.println(x);
	}
}

import java.util.Scanner;
import java.util.Arrays;

class BinarySearch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Declare length:");
		int len=sc.nextInt();

		int arr[]=new int[len];

		System.out.println("Enter items:");
		for(int i=0;i<len;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter search item:");
		int searchEl=sc.nextInt();

		int index=binarySearch(arr, searchEl);

		if(index==-1){
			System.out.println("OOPS! Item not found.");
		}else{
			System.out.println("Item found at index "+index);
		}
	}

	private static int binarySearch(int[] arr, int search){
		int start=0;
		int end=arr.length-1;

		while(start<=end){
			int mid=(start+end)/2;
			
			if(arr[mid]<search){
				start=mid+1;
			}else if(arr[mid]==search){
				return mid;
			}else{
				end=mid-1;
			}
		}
		return -1;
	}
}

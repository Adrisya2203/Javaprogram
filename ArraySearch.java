import java.util.Scanner;
public class ArraySearch
{
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the no.of element in the array:");
		int n=scanner.nextInt();
		int[] array=new int[n];
		System.out.println("enter the element of the array:");
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextInt();
		}
		System.out.println("enter the element to search for:");
		int target=scanner.nextInt();
		int index=-1;
		for(int i=0;i<array.length;i++)
		{
			if(array[1]==target)
			{
				index=i;
				break;
			}
		}
		if(index!=-1)
		{
			System.out.println("element found at index"+index);
		}
		else
		{
			System.out.println("elament not found in the array");
		}
		scanner.close();
	}
}							

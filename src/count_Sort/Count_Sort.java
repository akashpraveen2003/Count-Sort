package count_Sort;

import java.util.Arrays;
import java.util.Scanner;

/*
  Given an array A. Sort this array using Count Sort Algorithm and return the sorted array.


	Input 1:
	
	A = [1, 3, 1]
	
	Input 2:
	
	A = [4, 2, 1, 3]
	
	Output 1:
	
	[1, 1, 3]
	
	Output 2:
	
	[1, 2, 3, 4]
 */
public class Count_Sort {
	
	private static void count_sort(int[] array, int n) {		// Only for positive numberz
		
		int count[]=new int[n+1];				// store n+1 elements because of 0 based
		int i,j,k;
		for(i=0;i<array.length;i++)
		{
			try
			{
			count[array[i]]++;				// Incrementing the value in count array
			}
			catch(Exception e)
			{
				System.out.println("Array element is less than 0, works only for positive numbers");
				return;
			}
		}
		j=0;	
		for(i=0;i<=n;i++)
		{
			k=i;
			while(count[k]-->0)
			{
				array[j]=i;
				j++;
			}
		}
		System.out.println(Arrays.toString(array));
		
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int array[]=new int[n];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextInt();
			if(array[i]>max)
			{
				max=array[i];
			}
			
		}
		count_sort(array,max);		// max-min+1 gives the size for count array

	}
}

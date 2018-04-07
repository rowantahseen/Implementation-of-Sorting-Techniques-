/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkj1;

/**
 *
 * @author Nevine
 */

import java.util.Scanner;

public class MergeMe {
	double var1 = System.nanoTime();
	
	public void mergeSort (int[] list, int lowIndex, int highIndex)
	{
		if (lowIndex == highIndex)
			return;
		else {
			int midIndex = (lowIndex + highIndex) / 2;
			mergeSort(list, lowIndex, midIndex);
			mergeSort(list, midIndex + 1, highIndex);
			merge(list, lowIndex, midIndex, highIndex);
		} 
	}

	public void merge(int[] list, int lowIndex, int midIndex, int highIndex)
	{
		int[] L = new int[midIndex - lowIndex + 2];
		
		for (int i = lowIndex; i <= midIndex; i++)
		{
			L[i - lowIndex] = list[i];
		}
		L[midIndex - lowIndex + 1] = Integer.MAX_VALUE;
		int[] R = new int[highIndex - midIndex + 1];
		
		for (int i = midIndex + 1; i <= highIndex; i++)
		{
			R[i - midIndex - 1] = list[i];
		}
		R[highIndex - midIndex] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		
		for (int k = lowIndex; k <= highIndex; k++)
		{
			if (L[i] <= R[j])
			{
				list[k] = L[i];
				i++;
			}
			else {
				list[k] = R[j];
				j++;
			}
		} 
	}
        double var2 = System.nanoTime();
        double time = var2-var1;

    /* A utility function to print array of size n */
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    // Driver method
    public static void main(String args[])
    {
    	int n;
        Scanner s= new Scanner(System.in);
        n= s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]= s.nextInt();
        }
 
        MergeMe takh = new MergeMe();
        takh.mergeSort(arr, 0, n-1);
 
        System.out.println("\nSorted array");
        takh.printArray(arr);
        System.out.println("Runtime of merge sort is: " + (takh.time)+ " nano seconds");
    }
}

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

import java.util.Random;
import java.util.Scanner;

public class HeapAwy {
double var1 = System.nanoTime();
    public void HeapSort(int arr[], int n) {
        buildMaxHeap(arr, n);

        for (int i = n; i >= 1; i--) {
            
            int temp = arr[1];
            arr[1] = arr[i];
            arr[i] = temp;
            maxHeapify(arr, i-1, 1);
        }
    }
   double var2 = System.nanoTime();
   double time = var2-var1;

    void buildMaxHeap(int arr[], int n) {
        for (int i = n / 2; i >= 1; i--) {
            maxHeapify(arr, n, i);
        }
    }

    void maxHeapify(int arr[], int n, int i) {
        int largest;  // Initialize largest as root
        int l = 2 * i;  // left = 2*i 
        int r = 2 * i + 1;  // right = 2*i + 1

        if (l <= n && arr[l] > arr[i]) {
            largest = l;
        } else {
            largest = i;
        }

        if (r <= n && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            maxHeapify(arr, n, largest);

        }
        
    }
  
  

    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int n;
       Scanner s = new Scanner(System.in);
       System.out.print("Enter data size: ");
      n = s.nextInt();
//        System.out.print("Enter elements: ");
        int arr[] = new int[n + 1];
        System.out.println("The randome numbers are: ");
        Random r = new Random();
        int low = 0;
        int result;
        for(int i = 0; i<=n; i++){
            result = r.nextInt(n-low);
            arr[i] = result;
            System.out.print(result + " ");
        }
        System.out.println();
        
  

        HeapAwy boom = new HeapAwy();
        System.out.println("Max Heap is: ");
        boom.buildMaxHeap(arr, n);
        boom.printArray(arr);
        System.out.println("Heap sort: ");
        boom.HeapSort(arr, n);
        boom.printArray(arr);
        System.out.println("Runtime of heap sort is: " + (boom.var2-boom.var1)+ " nano seconds");
        
       
  
       
        
    }
}

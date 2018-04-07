/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkj1;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Nevine
 */
public class TestingSorts {
    public static void main(String[] args){
         BubblyBubble bubble = new BubblyBubble();
         Selection select = new Selection();
         HeapAwy heapAwy = new HeapAwy();
         MergeMe mergeMe = new MergeMe();
         Quickly quickly = new Quickly();
       int n;
       Scanner s = new Scanner(System.in);
       System.out.print("Enter data size: ");
       n = s.nextInt();
 
        int arrBubble[] = new int[n];
        int arrHeap[] = new int[n + 1];
        int arrMerge[] = new int[n];
        int arrQuick[] = new int[n];
        int arrSelect[] = new int[n];
        int arrRandom[] = new int[n];
        System.out.println("The random numbers are: ");
        Random r = new Random();
        int low = 0;
        
        //filling arrBubble
        for(int i = 0; i<n; i++){
            arrRandom[i] = r.nextInt(n-low);
            arrBubble[i] = arrRandom[i];
            System.out.print(arrRandom[i] + " ");
        }
        System.out.println();
        
         //filling arrSelect
        for(int i = 0; i<n; i++){
           
            arrSelect[i] = arrRandom[i];
        }
        //filling arrHeap
          for(int i = 0; i<n; i++){
            
            arrHeap[i+1] = arrRandom[i];
        }
          //filling arrMerge
           for(int i = 0; i<n; i++){
            
            arrMerge[i] = arrRandom[i];
      
        }
           //filling arrQuick
           for(int i = 0; i<n; i++){
            
            arrQuick[i] = arrRandom[i];
            
        }
        System.out.println();
        
        //bubble sort
        bubble.sort(arrBubble);
        System.out.println("Bubble sort result: ");
        for(int i = 0; i< arrBubble.length; i++){
            System.out.print(arrBubble[i] + " ");
        }
        System.out.println();
        System.out.println("Runtime of bubble sort is: " + (bubble.time)+ " nano seconds");
        System.out.println();
        
        //Selection sort
        select.selectionSort(arrSelect);
        System.out.println("Selection sort result: ");
        for(int i = 0; i< arrSelect.length; i++){
            System.out.print(arrSelect[i] + " ");
        }
        System.out.println();
        System.out.println("Runtime of selection sort is: " + (select.time)+ " nano seconds");
        System.out.println();
         
        //MaxHeap and heap sort
        System.out.println("Max Heap is: ");
        heapAwy.buildMaxHeap(arrHeap, n);
        heapAwy.printArray(arrHeap);
        System.out.println("Heap sort: ");
        heapAwy.HeapSort(arrHeap, n);
        heapAwy.printArray(arrHeap);
        System.out.println("Runtime of heap sort is: " + (heapAwy.time)+ " nano seconds");
        System.out.println();
        
        //merge sort
        mergeMe.mergeSort(arrMerge, 0, n-1);
        System.out.println("Merge Sort Result: ");
        mergeMe.printArray(arrMerge);
        System.out.println("Runtime of merge sort is: " + (mergeMe.time)+ " nano seconds");
        System.out.println();
        
        //quick sort
        quickly.sort(arrQuick, 0, arrQuick.length-1);
        System.out.println("Quick Sort Result: ");
        quickly.printArray(arrQuick);
        System.out.println("Runtime of quick sort is: " + (quickly.time)+ " nano seconds");
        System.out.println();
    }    
}
    
    


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
public class BubblyBubble {
    double var1 = System.nanoTime();
    public void sort(int arr[]){
        
        for(int i = 0; i<arr.length; i++){
            for(int j = 1; j<(arr.length-i); j++){
                if(arr[j-1]> arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }
    }
    double var2 = System.nanoTime();
    double time = var2-var1;
    public static void main(String[] args){
        BubblyBubble bubble = new BubblyBubble();
       int n;
       Scanner s = new Scanner(System.in);
       System.out.print("Enter data size: ");
       n = s.nextInt();
  
        int arr[] = new int[n];
        System.out.println("The random numbers are: ");
        Random r = new Random();
        int low = 0;
        int result;
        for(int i = 0; i<n; i++){
            result = r.nextInt(n-low);
            arr[i] = result;
            System.out.print(result + " ");
        }
        System.out.println();
        bubble.sort(arr);
        System.out.println("Sorted numbers: ");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
         System.out.println("Runtime of bubble sort is: " + (bubble.var2-bubble.var1)+ " nano seconds");
        
    }    
}

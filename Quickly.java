package pkj1;

/**
 *
 * @author Nevine
 */
public class Quickly {
double var1 = System.nanoTime();
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        int wall = (low-1); // index of smaller element = -1 eli hwa el wall
        for (int j=low; j<high; j++)
        {
            if (arr[j] <= pivot)
            {
                wall++;
 
                // swap arr[i] and arr[j] kol eli as3'ar 3l shemal
                int temp = arr[wall];
                arr[wall] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[wall+1];
        arr[wall+1] = arr[high];
        arr[high] = temp;
 
        return wall+1; //pivot
    }
 
 
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1); //eli abl el pivot weli ba3do
            sort(arr, pi+1, high);
        }
    }
    
    double var2 = System.nanoTime();
    double time = var2-var1;
 
     void printArray(int arr[])
    {
        
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    public static void main(String args[])
    {   Quickly quick = new Quickly();
        int arr[] = {6, 5, 1, 3, 8, 4,7,9,2};
 
        quick.sort(arr, 0, arr.length-1);
 
        quick.printArray(arr);
        System.out.println("Runtime of quick sort is: " + (quick.time)+ " nano seconds");
    }
}
    


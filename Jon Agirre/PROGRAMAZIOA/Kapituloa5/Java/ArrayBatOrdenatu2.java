import java.util.*;

public class ArrayBatOrdenatu2
{
    
    public static void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    // Prints the array
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);

        int Array[] = {1,3,5,2,4,7,6,9,8,10};
        sort(Array);
        printArray(Array);
        
        sarrera.close();
    }
}
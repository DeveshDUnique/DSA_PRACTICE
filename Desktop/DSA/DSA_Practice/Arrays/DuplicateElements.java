package Arrays;
import java.util.Arrays;

public class DuplicateElements 
{
    public static void main(String[] args) 
    {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 3};
        
        // Sort the array to bring duplicates together
       Arrays.sort(array);

       System.out.print("Sorted Array = ");
       for(int num:array)
       {
        System.out.print(num + " ");
       }
       
        // Count unique elements
        int uniqueCount = 0;
        for (int i = 0; i < array.length - 1; i++)  // its starting from 0 so length -1;
        {
            if (array[i] != array[i + 1]) // if current element is not equal to the next element then its unique
            {
                uniqueCount++;   // increase the count
            }
        }
        uniqueCount++; // Count last element
        
        // Create a new array to hold unique elements
        int[] uniqueArray = new int[uniqueCount];
        
        // Copy unique elements to the new array
        uniqueArray[0] = array[0];
        int index = 1;
        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] != array[i - 1]) 
            {
                uniqueArray[index++] = array[i];
            }
        }
        
        // Print the unique elements
        System.out.println();
        System.out.println("Array with duplicates removed:");
        for (int num : uniqueArray) 
        {
            System.out.print(num + " ");
        }
    }
}













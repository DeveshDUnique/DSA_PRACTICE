package NormllyAskedQuestions;

import java.util.Arrays;

public class BinarySearch
{
    public static int binarySearch(int arr[],int size, int number)
    {
        int i = 0; int j = size-1;

        while(i<=j)
        {
            int mid = i +(j-i)/2;

            if (number == arr[mid])  //if number is at middle position
            {
                return mid;     
            }

            else if (number < arr[mid])
            {
                j = mid - 1;  //we need to search on the left side of array
                
            }
            else
            {
                i = mid +1;
            }
        }

        return -1;
    }

    public static void main(String[] args) 
    {

        int arr[] = {2,5,6,7,1,9}; //array
        int num = 9;  //number
        Arrays.sort(arr); //sorting array
        int size = arr.length;
        int result = binarySearch(arr,size,num);
        System.out.println("element present at index = " + (result + 1)); 

 
    }
    
}

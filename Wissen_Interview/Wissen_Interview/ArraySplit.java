package Wissen_Interview;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySplit 
{

    public static List<int[]> splitArray(int[] array, int splitSize)
     {
        List<int[]> result = new ArrayList<>();   /// stores the arrays of integer type in the list. 
        System.out.println(array.length);
        int index = 0;  

        while (index < array.length) 
        {
            //copyOfRange  takes parameters integer array[], from index and to index
            int[] subArray = Arrays.copyOfRange(array, index, Math.min(index + splitSize, array.length));
            result.add(subArray);
            index += splitSize;  //incrementing the index to next of split array
        }
        

        return result;
    }





    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;

        List<int[]> splitArrays = splitArray(original, splitSize);

        for (int[] arr : splitArrays) {
            System.out.println(Arrays.toString(arr));
        }
    }
}

    


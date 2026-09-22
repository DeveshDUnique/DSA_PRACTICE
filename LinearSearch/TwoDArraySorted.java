package LinearSearch;

import java.util.Arrays;

//2D optimized search pattern
public class TwoDArraySorted {

    public static void main(String[] args) {
        int arr[][] = {
                        {10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {28, 29, 37, 49},
                        {33, 34, 39, 50}
        };
        // finding the target element in 2-D sorted array
        int target = 11;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int arr[][], int target) {
        int row =0;
        int column = arr.length - 1;

        while(row < arr.length && column >= 0){
            if(arr[row][column] == target){
                return new int[]{row, column};
            }
            else if(target < arr[row][column]){
                column --;
            }else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}

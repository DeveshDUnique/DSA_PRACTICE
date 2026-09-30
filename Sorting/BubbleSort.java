package Sorting;

//  O(n²) avg time complexity

import java.util.Arrays;

// O(n) best time complexity if already in ascending order

public class BubbleSort {
    public static void main(String[] args) {
        int arr [] = {3,1,5,9,8};
        bubbleSort(arr);
        System.out.print(Arrays.toString(arr));
    }


    static void bubbleSort(int arr[]) {
        boolean swapped;

        for(int i=0; i<arr.length - 1; i++){
            swapped = false;
            for (int j=1; j<arr.length - i; j++) {
                int temp = arr[j];
                if(arr[j] < arr[j-1]) {
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped =true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    
}

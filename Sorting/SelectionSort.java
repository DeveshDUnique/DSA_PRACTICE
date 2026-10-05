package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {30,2,7,5,19,48};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int arr[]) {
        for(int i=0; i< arr.length; i++) {
            int last = arr.length -i -1; 
            int maxIndex = peakIndex(arr, 0, last);
            swap(arr,maxIndex,last);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        
    }

    static int peakIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    
}

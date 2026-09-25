
import java.util.Arrays;

public class TwoDArrayFullySorted {

    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        int target = 6;

        System.out.println(Arrays.toString(searchInSorted(arr, 6)));
    }

    static int binarySearch(int[][] arr, int row, int cstart, int cend, int target) {



    }

    static int[] searchInSorted(int [][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        if(cols == 0) {
            return new int []{-1,-1};
        }
        if(rows == 1) {
            binarySearch()
        }

        int rLowerBound = 0;
        int rUpperBound = rows - 1;
        int cMid = cols/2;

        //run until we will have 2 rows remaining.
        while(rLowerBound < (rUpperBound - 1)) {
            int mid = rLowerBound + (rUpperBound - rLowerBound)/2;

            if(matrix[mid][mid] > target){
                rUpperBound = mid;
            }
            else {
                rLowerBound = mid; // because the mid is the only where we will have 2 rows
            }
        }

        // now we have two rows
        




    }
    
}

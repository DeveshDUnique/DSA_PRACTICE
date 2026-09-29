
import java.util.Arrays;

public class TwoDArrayFullySorted {

    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11}
        };

        int target = 10;

        System.out.println(Arrays.toString(searchInSorted(arr, target)));
    }

    static int[] binarySearch(int[][] arr, int row, int cstart, int cend, int target) {
        while(cstart <= cend) {
            int mid = cstart + (cend - cstart)/2;

            if(arr[row][mid] == target) {
                return new int[]{row, mid};
            }
            if(target < arr[row][mid]){
                cend = mid - 1;
            }
            else {
                cstart = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] searchInSorted(int [][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        if(cols == 0) {
            return new int[]{-1,-1};
        }
        if(rows == 1) {
            return binarySearch(matrix, 0, 0, cols -1, target);
        }

        int rLowerBound = 0;
        int rUpperBound = rows - 1;
        int cMid = cols/2;

        //run until we will have 2 rows remaining.
        while(rLowerBound < (rUpperBound - 1)) {
            int mid = rLowerBound + (rUpperBound - rLowerBound)/2;
         
            if(matrix[mid][cMid] == target) {
                return new int[] {mid, cMid};
            }

            if(matrix[mid][cMid] > target){
                rUpperBound = mid;
            }
            else {
                rLowerBound = mid; // because the mid is the only where we will have 2 rows
            }
        }

        // now we have two rows
        // 1. check in the mid columns for the target
        if(matrix[rLowerBound][cMid] == target) {
            return new int[]{rLowerBound, cMid};
        }
        if(matrix[rLowerBound + 1][cMid] == target) {
            return new int[]{rLowerBound + 1, cMid};
        }
        // 2. check at the 1st row
        if(target <= matrix[rLowerBound][cMid - 1]) {
            return binarySearch(matrix, rLowerBound, 0, cMid -1, target);
        }
        if(target >= matrix[rLowerBound][cMid + 1] && target <= matrix[rLowerBound][cols - 1]) {
            return binarySearch(matrix, rLowerBound, cMid + 1, cols -1, target);
        }
        // 3. check at the 2nd row
        if (target <= matrix[rLowerBound + 1][cMid - 1]) {
            return binarySearch(matrix, rLowerBound + 1, 0, cMid-1, target);
        } else {
            return binarySearch(matrix, rLowerBound + 1, cMid + 1, cols - 1, target);
        }
    }
    
}

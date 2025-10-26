package freshwork;
import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;

public class PowerOfTwo 
{

    public static int countPairs(int[] arr) {
        // Step 1: Initialize counter variable
        int pairsCount = 0;

        // Step 2: Create a hashmap to store the count of each element
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Step 3: Iterate through the array and powers of 2
        int maxNum = 2 * getMax(arr);
        for (int num : arr) {
            for (int powerOfTwo = 1; powerOfTwo <= maxNum; powerOfTwo *= 2) {
                int complement = powerOfTwo - num;
                if (complement > num) {
                    // Step 4: Check if complement exists in the hashmap
                    pairsCount += countMap.getOrDefault(complement, 0) * countMap.getOrDefault(num, 0);
                }
            }
        }

        // Step 5: Return the counter
        return pairsCount;
    }

    // Utility function to get the maximum element in the array
    private static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 11, 14, 5, 13};
        int pairs = countPairs(arr);
        System.out.println("Maximum possible number of pairs: " + pairs);
    }
}









    

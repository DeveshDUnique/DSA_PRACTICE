package Arrays;

import java.util.HashMap;

public class TwoSumWithHashMap 
{
    public static int[] twoSum(int arr[] ,int target)
    {
        HashMap<Integer,Integer>map = new HashMap<>();  //taking a blank hashmap

        for(int i=0; i<arr.length;i++)
        {
            map.put(arr[i], i); // putting the number and index in the hashmap
        }
        System.out.println(map.values());  //these are indexes that we need to return so stored into the values
        System.out.println(map.keySet()); //these are the numbers 

        //searching the hashmap
        for(int i=0;i<arr.length;i++)
        {
            int num = arr[i]; //taking the number in the num variable.
            int rem = target - num; //to find the remaining number to be added.
            if (map.containsKey(rem)) // to check if the hashmap contains the .
            {
                int index = map.get(rem);  //to get the index of the element.
                if (index ==i) 
                {
                    continue;
                }

                return new int[]{i,index};  // returning the indexes of number.
            }
        }
        return null;
    }

    public static void main(String[] args) 
    {
        int arr[] = {2,7,5,4};
        int result[] = twoSum(arr, 9);

        for(int i=0; i < result.length; i++)
        {
            System.out.print(result[i] + ",");
        }
        
    }
   
}

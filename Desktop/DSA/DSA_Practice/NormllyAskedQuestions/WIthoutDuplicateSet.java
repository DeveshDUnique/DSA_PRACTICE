package NormllyAskedQuestions;

import java.util.HashSet;
import java.util.Set;

public class WIthoutDuplicateSet 
{
    public static int  nonDuplicate(int arr[])
    {
        Set <Integer> set = new HashSet() ;

        for(int num:arr)
        {
            if (set.contains(num))
            {
                set.remove(num);
                
            }
            else
            {
                set.add(num);
            }
        }

    // Return the first element of the set
        return set.iterator().next();
    }

    public static void main(String[] args) 
    {
        int arr[] = {4,2,1,1,2};
        int number = nonDuplicate(arr);
        System.out.println("Number = " + number);

    }
    
}

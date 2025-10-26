package Wissen_Interview;

import java.util.ArrayList;
import java.util.List;

//To reduce time complexity and iterations, you can optimize the approach by iterating up to the square root of the given number.

public class factors 
{

    public static List<Integer> findFactors(int num)
    {
        List<Integer> lst = new ArrayList<>(); // arraylist

        for(int i=1; i*i <= num ;i++) //if i is less than or equal to number
        {
            if (num % i == 0)
            
                lst.add(i);
            
           
            if (i != num/i) //when i = 6, and again when i = 36 / 6 = 6. This would result in duplicates in the list of factors.
            // to avoid the duplicates
            {
                lst.add(num/i);
            }
        }

        return  lst;

    }

    public static void main(String[] args) 
    {
        int num = 36;
        List<Integer> lst = findFactors(num);

        System.out.println("Factors are = "+lst);
    }
}






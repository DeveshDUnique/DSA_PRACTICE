package Wissen_Interview;

//find the sum of squares of all the odd numbers in an ArrayList<Integer>:

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class SumOfSquares 
{

    public static void main(String[] args) 
    {

        List<Integer> lst = new ArrayList<>();

        Collections.addAll(lst, 1,2,3,4,5,6,7,8);  //adding to elements of the list

        int sum = lst.stream()
                               .filter(ele -> ele % 2 !=0 )
                               .mapToInt(ele -> ele*ele)
                               .sum();


        System.out.println(sum);
        
    }
    
}

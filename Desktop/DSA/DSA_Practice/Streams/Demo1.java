
//list of integers and return sum of even numbers
package Streams;
import java.util.Arrays;
import java.util.List;

public class Demo1 

{
    static int sumOfEven(List<Integer>numbers)
    {
        int sum =0;

        for(int num : numbers)
        {
            if(num % 2 == 0)
            {
                sum += num ;
            }

        }
        return sum;
    }

    public static void main(String[] args) 
    {

        //int arr[] = {2,3,4,5,6,7,8,9,10};
        // List<Integer> list = Arrays.asList(arr);
        
        List<Integer>lst = List.of(2,3,4,5,6,7,8,9,10);

        int sum = sumOfEven(lst);

        System.out.println("Sum =" +sum );
        
    }
    
}










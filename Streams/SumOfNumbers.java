package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers 
{
    public static void main(String[] args) {
        

    List<Integer> lst = Arrays.asList(1,4,6,22,90,89,55,6);

    Optional<Integer> sum = lst.stream()
                               .reduce((a,b) -> a+b);
    
    System.out.println(sum.get());

    }
    
}




package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sorting 
{
    public static void main(String[] args) {
                List<Integer> list = Arrays.asList(0,3,10,20,30,15,1,13,1,2,2,10,40,19,3,40); //

                //ascending 
                List<Integer>ascending = list.stream().sorted().collect(Collectors.toList());
                System.out.println(ascending);

                
                //descending
                List<Integer> descending = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
                System.out.println(descending);

    }

}
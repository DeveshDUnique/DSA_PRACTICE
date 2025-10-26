package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestLowest 
{

    public static void main(String[] args) 
    {
        List<Integer> list = Arrays.asList(0,3,10,20,30,15,1,13,1,2,2,10,40,19,3,40); //

        int secondHighest = list.stream()
                                .sorted(Collections.reverseOrder())
                                .distinct()
                                .skip(1)
                                .findFirst()
                                .get();
        System.out.println(secondHighest);

        int secondLowest = list.stream()
                                .sorted()
                                .distinct()
                                .skip(1)
                                .findFirst()
                                .get();
        System.out.println(secondLowest);

    }
    
}

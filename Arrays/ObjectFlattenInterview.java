package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectFlattenInterview 
{

    public static Integer[] flatten(Object[] inputArray) 
    {

        List<Integer> lst = new ArrayList<>(); //list of integers

        for(Object ob : inputArray)  //for each loop
        {
            if (ob instanceof Object[]) // if the element is instance of object array.
            {
                Integer subarray []= flatten((Object[]) ob);
                lst.addAll( Arrays.asList(subarray)); //Appends all of the elements in the specified collection to the end of this list
                // method converts the array subarray into a List. 
            }
            else if(ob instanceof Integer)  // if the element i integer
            {
                lst.add((Integer)ob);  // cast the object ob to an Integer
            }
    
        }

        Integer flattenedArray [] = new Integer[lst.size()]; // new integer array of size of the list
        lst.toArray(flattenedArray); //list to the array conversion


        return  flattenedArray; //returning an integer array
    }



    public static void main(String[] args) throws Exception {
        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };

        Integer[] flattenedArray = flatten(array); 

        System.out.println(Arrays.toString(flattenedArray));
    }
    
}

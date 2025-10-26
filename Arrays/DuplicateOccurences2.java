package Arrays;
//import javafx.util.Pair;
import java.util.ArrayList;
import java.util.List;



class Pair<K, V> 
{
    private final K key;
    private final V value;

    public Pair(K key, V value) 
    { 
        this.key = key;
        this.value = value;
    }

    public K getKey() 
    { 
        return key;
    }

    public V getValue() 
    {
        return value;
    }

}


public class DuplicateOccurences2 
{

    private static Pair<List<Integer>, Integer> removeAndCount(int arr[] , int number) 
    {
        List <Integer> list = new ArrayList<>();  // to store the unique elements
        int count =0;


        for(int num: arr )  // foreach loop to retrive element from the array 
        {
            if (num != number)  // comparing the given number to the number in the list
            {
                list.add(num); //adding the number to the list         
            }
            else
            {
                count++;

            }
        }
        return new Pair<>(list,count);
    }

    public static void main(String[] args) 
    {

        int arr[] = {1,2,3,4,2,5,2,6};
        int number = 2;


        Pair<List<Integer>,Integer> result = removeAndCount(arr,number);    
        List<Integer> list = result.getKey(); // getting the list
        int count = result.getValue();

        System.out.println("New list =" + list);
        System.out.println("Count = "+ count);
    }   
}


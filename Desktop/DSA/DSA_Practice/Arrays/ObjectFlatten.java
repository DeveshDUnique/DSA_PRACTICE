package Arrays;
import java.util.ArrayList;
import java.util.List;


public class ObjectFlatten 
{
    public static List<Object> flattenArray(Object[] array) 
    {
        List<Object> result = new ArrayList<>();
        
        for (Object obj : array)  //iterting through the object array 
        {
            if (obj instanceof Object[])  // checks if the current element obj is an instance of an array of Object.
            // This is used to determine if the current element is nested or not.
            {
                List<Object> sublist = flattenArray((Object[]) obj); //If the current element is an array of Object,
// this line recursively calls the flattenArray method to flatten the nested array. The result is stored in a new List<Object> named sublist.
                result.addAll(sublist);//line adds all the elements from the sublist to the result list. 
            }
            else 
            {
                result.add(obj);
            }
        }

        return result;
    }

    
    public static void main(String[] args) {
        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
        List<Object> flattenedList = flattenArray(array);

        System.out.println(flattenedList);
    }
}

    


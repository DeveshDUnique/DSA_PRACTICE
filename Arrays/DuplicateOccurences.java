package Arrays;

import java.util.ArrayList;
import java.util.List;


public class DuplicateOccurences 
{

    // This nested class serves as a convenient container for returning multiple values from the removeOccurrences method.
    public static class RemovalResult 
    {
        private final List<Integer> modifiedList;
        private final int countRemoved;

        public RemovalResult(List<Integer> modifiedList, int countRemoved) //parameterized constructor to create object with list and count values
        {
            this.modifiedList = modifiedList;
            this.countRemoved = countRemoved;
        }

        public List<Integer> getModifiedList()  //getter of list to return the modified list
        {
            return modifiedList;
        }

        public int getCountRemoved() //getter of count to return the counts of duplicate numbers.
        {
            return countRemoved;
        }
    }

    public static RemovalResult removeOccurrences(List<Integer> numbers, int toRemove)   // will retun the object of RemovalResult method
    {
        List<Integer> modifiedList = new ArrayList<>(numbers);
        int countRemoved = 0;
        
        // Remove all occurrences of the second parameter
        for (int i = 0; i < modifiedList.size() - 1; i++) 
        {
            if (modifiedList.get(i).equals(toRemove)) 
            {
                modifiedList.remove(i);
                countRemoved++;
            }
        }
        
        return new RemovalResult(modifiedList, countRemoved); //return the object with parameterized constructor values.
    }

    public static void main(String[] args) 
    {
        
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 2, 5, 2, 6));  //we can also use Arrays.asList();
        int toRemove = 2;

        RemovalResult result = removeOccurrences(numbers, toRemove);
        System.out.println("Modified List: " + result.getModifiedList()); // getting list through calling getter of list
        System.out.println("Count of elements removed: " + result.getCountRemoved());  //getting list through calling the getter of count
         

    }
}



///another approach with  Pair<List<Integer>, Integer>






























public class SmallestLetter
 {
  public static void main(String[] args) 
    {
        char letters[] = {'c','f','j'};
        char target = 'f';
        int ans = smallestLetter(letters,target);
        System.out.println("The letter is  = "+ letters[ans]);
    }

    static int smallestLetter(char letters[],char target)
    {

        System.out.println(letters.length);
        int start = 0; // starting index

        int end = letters.length - 1;  // end index
        
        if(letters.length < 1)
        {
            return -1;
        }

        while (start <= end)
        {
            int mid = start + (end - start)/2;  // mid condition for the elements to not cross integer limit in array 

            if (target >= letters[mid])
            {
                start = mid + 1;
                
            }
            else 
            {
                end = mid-1;
                
            }
       
                          
        }
        return start % letters.length ;
    }

}


    


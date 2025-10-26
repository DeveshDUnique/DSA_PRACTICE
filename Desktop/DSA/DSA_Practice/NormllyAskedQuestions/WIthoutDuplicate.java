package NormllyAskedQuestions;

// Return the number from array that is not duplicate
//Normal approach on the spot

public class WIthoutDuplicate 
{
    public static int nonDuplicate(int [] arr)
    {
        int n = arr.length;
        int count = 0;

        //traversing the array
        for(int i=0; i<n; i++)
        {
            boolean duplicateFound = false;
            
            for(int j= 0; j<n; j++)
            {
                if(i !=j && arr[i] == arr[j])  // checking for duplicates
                {
                    duplicateFound = true;
                    break;
                }
            }
            if (!duplicateFound)
            {
            
                return arr[i];
                
            }
        }

        return -1; //If no duplicate value is found return the default value

    }

    public static void main(String[] args)
    {
        int arr[] = {2,2,1};
        int number = nonDuplicate(arr);
        System.out.println("The non-duplicate number is = " + number);

    }
    
}












